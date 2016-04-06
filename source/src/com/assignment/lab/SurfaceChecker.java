package com.assignment.lab;

public class SurfaceChecker {
	public double Surcheck(double length,double radius) {
		
		Double Surface = ((radius * 3.14 * radius + 3.14 * radius * length));
			System.out.println("values: " + Surface  + " + " + length);
			return Surface;

	}
}
