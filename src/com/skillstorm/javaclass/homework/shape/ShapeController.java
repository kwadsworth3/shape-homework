package com.skillstorm.javaclass.homework.shape;

public class ShapeController {

	public static void main(String[] args) {
		Shape test1 = new Shape();
		System.out.println(test1); // testing defaults
		
		Shape triangle = new Shape();
		triangle.setAngles("3");
		System.out.println(triangle); // testing resets for triangle
		
		Hexagon hexagon = new Hexagon();
		hexagon.setSideLength(3.0); // setting side length to ensure area and perimeter are calculated without storing them
		System.out.println(hexagon); // angles was overridden in hexagon
		
		Hexagon hex2 = new Hexagon();
		hex2.setSideLength(12.0);
		System.out.println(hex2); // retest to ensure it works with separate objects

	}

}
