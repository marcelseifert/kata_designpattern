package de.hamburg.mse.kata.designpattern.structural.prototype;

import java.util.HashMap;

public class ShapeStore {

	private static HashMap<Shape.TYP, Shape> store = new HashMap<>();
	
	static {
		store.put(Shape.TYP.CIRCLE, new Circle());
		store.put(Shape.TYP.RECTANGLE, new Rectangle());
		store.put(Shape.TYP.POINT, new Point());
		store.put(Shape.TYP.TRIANGLE, new Triangle());		
	}
	
	public static Shape getById(Shape.TYP typ) {
		return store.get(typ).prototype();
	}
}
