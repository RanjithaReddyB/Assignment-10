package com.assignment.lab;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestSurface {


	SurfaceChecker sc = new SurfaceChecker();
	Double cm= sc.Surcheck(1.0,1.0);
	Double DefSur =  5.28;
	DecimalFormat f = new DecimalFormat("##.00");
	String tht = f.format(cm);
	Double pm = Double.parseDouble(tht);

	
	@Test
	public void testheight() {
		System.out.println("@Test surface(): "+DefSur + " = " + pm);
		assertEquals(DefSur, pm);
	}


}
