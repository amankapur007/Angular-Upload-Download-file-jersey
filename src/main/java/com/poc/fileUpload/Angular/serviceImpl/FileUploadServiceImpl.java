package com.poc.fileUpload.Angular.serviceImpl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.core.Response;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.poc.fileUpload.Angular.model.FileUploadModel;
import com.poc.fileUpload.Angular.persister.FileUploadMapper;
import com.poc.fileUpload.Angular.service.FileUploadService;
@Service
public class FileUploadServiceImpl implements FileUploadService{

	@Autowired
	FileUploadMapper mapper;
	private OutputStream outputStream;
	
	@Override
	public List <FileUploadModel> UploadFile(FileUploadModel fileUploadModel) {
		// TODO Auto-generated method stub
		System.out.println("File name : "+fileUploadModel.getDaFileName());
		System.out.println("File type : "+fileUploadModel.getDaFileType());
		List <FileUploadModel> files = mapper.getFile();
		//mapper.createFile(fileUploadModel);
		Iterator<FileUploadModel> itr = files.iterator();
		for(FileUploadModel f : files){
			System.out.println(f);
		}
		return files;
	}

	@Override
	public File downloadFile() throws IOException {
		// TODO Auto-generated method stub
		File fil=File.createTempFile("temp-file-name", ".png");
		int id =104;
		FileUploadModel fm =mapper.downloadFile(id);
		InputStream inputStream = fm.getDaFile();
		outputStream = new FileOutputStream(fil);
		int read = 0;
		byte[] bytes = new byte[102400000];

		while ((read = inputStream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, read);
		}
		return fil;
	}

}
