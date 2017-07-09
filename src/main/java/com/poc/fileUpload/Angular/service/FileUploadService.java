package com.poc.fileUpload.Angular.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.ws.rs.core.Response;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.poc.fileUpload.Angular.model.FileUploadModel;

public interface FileUploadService {
	public List <FileUploadModel> UploadFile(FileUploadModel fileUploadModel);

	public File downloadFile() throws IOException;

}
