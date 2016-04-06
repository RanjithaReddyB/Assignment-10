package com.assignment.lab;

public class VolumeChecker {
public double Volcheck(double length,double radius) {
		
	 double volume=(3.14 * radius * radius)/length;
		System.out.println("values: " +volume  + " + " + length);
		return volume;

}
}