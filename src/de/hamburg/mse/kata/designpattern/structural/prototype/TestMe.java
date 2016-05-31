package de.hamburg.mse.kata.designpattern.structural.prototype;

import de.hamburg.mse.kata.designpattern.structural.prototype.Shape.TYP;

public class TestMe {

	public static void main(String[] args) {
		ShapeStore.getById(TYP.CIRCLE).draw();
		ShapeStore.getById(TYP.CIRCLE).draw();
		ShapeStore.getById(TYP.RECTANGLE).draw();
		ShapeStore.getById(TYP.RECTANGLE).draw();
	}
}
