package com.poc.fileUpload.Angular.rest.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface HelloWorld {

	@GET
	@Path("/helloWorld")
	@Consumes(MediaType.APPLICATION_JSON)
	public String getHelloWorld();
}
