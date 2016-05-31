package de.hamburg.mse.kata.designpattern.structural.abstractfactory;

public interface Circle extends Shape {

	@Override
	default void printIt() {
		System.out.println("circle...");	
	}
}
