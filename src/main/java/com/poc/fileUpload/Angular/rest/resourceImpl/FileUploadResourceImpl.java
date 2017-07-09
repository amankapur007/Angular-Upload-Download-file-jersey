package com.poc.fileUpload.Angular.rest.resourceImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.glassfish.jersey.media.multipart.ContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.poc.fileUpload.Angular.model.FileUploadModel;
import com.poc.fileUpload.Angular.rest.resource.FileUploadResource;
import com.poc.fileUpload.Angular.service.FileUploadService;

@Component
public class FileUploadResourceImpl implements FileUploadResource {

	@Autowired
	FileUploadService fileUploadService;
	private OutputStream outputStream;

	public FileUploadResourceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Response createFile(FormDataBodyPart jsonPart, FormDataBodyPart bodyPart)
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		jsonPart.setMediaType(MediaType.APPLICATION_JSON_TYPE);
		FileUploadModel fm = jsonPart.getValueAs(FileUploadModel.class);
		bodyPart.setMediaType(MediaType.MULTIPART_FORM_DATA_TYPE);
		InputStream is = bodyPart.getValueAs(InputStream.class);
		ContentDisposition fileContent = bodyPart.getContentDisposition();
		fm.setDaFileName(fileContent.getFileName());
		fm.setDaFileType(fileContent.getType());
		fm.setDaFile(is);
		System.out.println(bodyPart.getValueAs(InputStream.class));
		System.out.println(bodyPart.getContentDisposition().getFileName());
		return Response.ok(fileUploadService.UploadFile(fm)).status(200).build();
	}

	@Override
	public Response downloadFile() throws IOException {
		// TODO Auto-generated method stub
		File file = fileUploadService.downloadFile();
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition", "attachment;filename=aman.png");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.delete());
		return response.build();
	}

}
