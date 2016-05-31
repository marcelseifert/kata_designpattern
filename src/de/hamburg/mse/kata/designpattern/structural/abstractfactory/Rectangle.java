package de.hamburg.mse.kata.designpattern.structural.abstractfactory;

public interface Rectangle extends Shape {
	
	@Override
	default void printIt() {
		System.out.println("rectangle...");	
	}
}
