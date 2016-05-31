package de.hamburg.mse.kata.designpattern.structural.abstractfactory;

public class RectangleFactory extends AbstractShapeFactory {
 
	@Override
	Shape createForm() { 
		return new Rectangle() {
		};
	}

}
