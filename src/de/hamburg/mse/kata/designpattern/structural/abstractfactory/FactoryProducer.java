package de.hamburg.mse.kata.designpattern.structural.abstractfactory;

public class FactoryProducer {

	public static enum TYP {
		CIRCLE, RECTANGLE;
	}

	public static AbstractShapeFactory createFactory(TYP typ) {
		switch (typ) {
		case CIRCLE:
			return new CircleFactory();
		case RECTANGLE:
			return new RectangleFactory();
		default:
			return null;
		}
	}
}
