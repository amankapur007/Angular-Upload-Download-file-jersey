package com.poc.fileUpload.Angular.rest.resource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataParam;

@Path("/")
public interface FileUploadResource {

	@POST
	@Path("v1/fileUpload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces({MediaType.APPLICATION_JSON})
	public Response createFile(@FormDataParam("fileEmp") FormDataBodyPart jsonPart,
            @FormDataParam("file") FormDataBodyPart bodyPart) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException;
	
	@GET
	@Path("v1/download")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public Response downloadFile() throws IOException;
}
