package com.assignment.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/vconv")
public class Volume {
	@GET
	@Produces("application/xml")
	public String vconversion(){
		 
		Double Radius= 1.0;
		Double Height= 1.0;
		Double volume;
				
		volume=(3.14 * Radius * Radius)/Height;
				
		String result="Output: Volume of Cone" + volume;
		return "<volumeout>" + "<Radius>" + Radius + "</Radius>" +  "<Height>" + Height + "</Height>"+"<Result>"+ result +"</Result>"+ "</volumeout>";
		
	}
		@Path("{a}/{b}")
		@GET
		@Produces("application/xml")
		
		public String VConvert(@PathParam("a") Double a,@PathParam("b") Double b) {
			Double Radius= a;
			Double Height= b;
			Double volume;
					
			volume=(3.14 * Radius * Radius)/Height;
					
			String result="Output: Volume of Cone" + volume;
			return "<volumeout>" + "<Radius>" + Radius + "</Radius>" +  "<Height>" + Height + "</Height>"+"<Result>"+ result +"</Result>"+ "</volumeout>";}

}

