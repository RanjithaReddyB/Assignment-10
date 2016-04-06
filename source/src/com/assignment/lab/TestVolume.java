package com.assignment.lab;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestVolume {

	VolumeChecker vc = new VolumeChecker();
	Double cm= vc.Volcheck(1.0,1.0);
	Double DefVol =  3.14;
	DecimalFormat f = new DecimalFormat("##.00");
	String tht = f.format(cm);
	Double pm = Double.parseDouble(tht);

	
	@Test
	public void testheight() {
		System.out.println("@Test volume(): "+DefVol + " = " + pm);
		assertEquals(DefVol, pm);
	}


}
