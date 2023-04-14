package com.skillstorm.javaclass.homework.shape;

public class Shape {
	private int dimensions;
	private boolean polygon;
	private String angles;
	
	public Shape() {
		this.dimensions = 2;
		this.polygon = true;
		this.angles = "no";
	}
	
	public Shape(int dimensions, boolean polygon, String angles, int area) {
		this.dimensions = dimensions;
		this.polygon = polygon;
		this.angles = angles;

	}

	public int getDimensions() {
		return dimensions;
	}

	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}

	public boolean getPolygon() {
		return polygon;
	}

	public void setPolygon(boolean polygon) {
		this.polygon = polygon;
	}
	public String getAngles() {
		return angles;
	}

	public void setAngles(String angles) {
		this.angles = angles;
	}

	@Override
	public String toString() {
		return "This shape has " + dimensions + " dimensions. Is it a polygon? " + polygon + ". It also has " + angles + " angles.";
	}
	
}
