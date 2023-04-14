package com.skillstorm.javaclass.homework.shape;

public class Hexagon extends Shape {
	private int sides;
	private double sideLength;

	public Hexagon() {
		super();
		this.sides = 6;
		this.sideLength = 0;
	}

	public Hexagon(int sides, double sideLength) {
		super();
		this.sides = sides;
		this.sideLength = sideLength;
	}

	@Override
	public String getAngles() {
		return "6";
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	public double area() {
		double area = 6 * (0.433 * Math.pow(this.sideLength, 2.0));
		return area;
	}

	public double perimeter() {
		return this.sideLength * 6;
	}

	@Override
	public String toString() {
		return "This hexagon has " + getDimensions() + " dimensions and " + sides + " sides. Is it a polygon? "
				+ getPolygon() + ". It also has " + getAngles() + " angles." + " The side length is " + getSideLength()
				+ ". The perimeter is: " + perimeter() + ". The area is: " + area() + ".";
	}

}
