package de.hamburg.mse.kata.designpattern.structural.abstractfactory;

public class TestMe {

	public static void main(String[] args) {
		FactoryProducer.createFactory(FactoryProducer.TYP.CIRCLE).createForm().printIt();

		FactoryProducer.createFactory(FactoryProducer.TYP.RECTANGLE).createForm().printIt();
	}

}
