package entities;

import entities.enums.Color;

public abstract class Shape { // O método abstrato obriga a classe a ser abstrata tb
	private Color color;

	public Shape() {

	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area(); // método abstrato
}
