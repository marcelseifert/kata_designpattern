package de.hamburg.mse.kata.designpattern.structural.singleton;

public final class MyHolder {

	/**
	 * 
	 * Damit wird erst durch den Aufruf von Instance die Klasse wirklich erst intanziert (Lazy)
	 *
	 */
	private static final class HOLDER {
		private static final MyHolder INSTANCE = new MyHolder();
	}
	
	private MyHolder() {		
	}
	
	public static MyHolder getInstance() {
		return HOLDER.INSTANCE;
	}
}
