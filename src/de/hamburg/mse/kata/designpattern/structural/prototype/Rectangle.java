package de.hamburg.mse.kata.designpattern.structural.prototype;

public class Rectangle extends Shape {

	public void draw() {
		System.out.printf("\n%s draw rectangle",this.hashCode());
	}
}
