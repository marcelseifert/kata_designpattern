package de.hamburg.mse.kata.designpattern.structural.abstractfactory;

public class CircleFactory extends AbstractShapeFactory {

	@Override
	Shape createForm() {
		return new Circle() {
		};
	}
 

}
