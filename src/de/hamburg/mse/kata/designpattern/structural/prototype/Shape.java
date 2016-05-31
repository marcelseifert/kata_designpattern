package de.hamburg.mse.kata.designpattern.structural.prototype;

public abstract class Shape implements Cloneable {

	public static enum TYP {
		CIRCLE, RECTANGLE, TRIANGLE, POINT
	}
	
	public abstract void draw();
	
	public final Shape prototype() {
		try {
			return (Shape)this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
