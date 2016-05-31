package de.hamburg.mse.kata.designpattern.structural.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public final class ThreadChecker implements Runnable {

	private final AtomicInteger atomicHashCode = new AtomicInteger();
	
	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(10);
		
		for(int i = 0 ; i < 10; i++) {
			service.execute( new ThreadChecker());
		}
		service.shutdown();
	}

	@Override
	public void run() {
		System.out.println("Run "+Thread.currentThread().getId());
		if( MyHolder.getInstance() == null ) {
			throw new RuntimeException("MyHolder.getInstance is null");
		}
		int oldHashCode = atomicHashCode.getAndSet(MyHolder.getInstance().hashCode());
		
		if( oldHashCode > 0 && oldHashCode != MyHolder.getInstance().hashCode() ) {
			throw new RuntimeException("MyHolder.getInstance not expected hashCode!");
		}
	}
}
