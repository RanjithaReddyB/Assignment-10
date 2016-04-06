package com.assignment.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/sconv")
public class Surface {
	@GET
	@Produces("application/xml")
	public String vconversion(){
		 
		Double Radius= 1.0;
		Double Length= 1.0;
		Double Surface;
				
		Surface = ((Radius * 3.14 * Radius + 3.14 * Radius * Length));		
		String result="Output: Surface Area" + Surface;
		return "<Surface>" + "<length>" + Length + "</length>" +  "<Radius>" + Radius + "</Radius>"+"<result>"+result+"</result>"+"</Surface>";
		
	}
	@Path("{a}/{b}")
	@GET
	@Produces("application/xml")
	
	public String VConvert(@PathParam("a") Double a,@PathParam("b") Double b) {
		Double Radius= a;
		Double Length= b;
		Double Surface;
				
		Surface = ((Radius * 3.14 * Radius + 3.14 * Radius * Length));		
		String result="Output: Surface Area" + Surface;
		return "<Surface>" + "<length>" + Length + "</length>" +  "<Radius>" + Radius + "</Radius>"+"<result>"+result+"</result>"+"</Surface>";
	}
}
