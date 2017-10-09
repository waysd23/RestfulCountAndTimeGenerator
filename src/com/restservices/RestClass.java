package com.restservices;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Ashutosh Purohit
 *
 */
@Path("/some-app")
public class RestClass {

	 private static Integer counter =0;
	@GET
	@Path("/some-service")
	@Produces({MediaType.APPLICATION_JSON})
	public Response getMessage() {
		
		DateFormat iso8601DateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'", Locale.ENGLISH);
	    //iso8601DateFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
		RestOutputData restOutputData = new RestOutputData();

		restOutputData.setTimestamp(iso8601DateFormatter.format(new Date()));
		restOutputData.setCalls(++counter); 	 
		return Response.status(200).entity(restOutputData).build();
	}
}