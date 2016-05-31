package de.hamburg.mse.kata.designpattern.structural.prototype;

public class Circle extends Shape {

	public void draw() {
		System.out.println(this.hashCode() + " draw circle");
	}
}
