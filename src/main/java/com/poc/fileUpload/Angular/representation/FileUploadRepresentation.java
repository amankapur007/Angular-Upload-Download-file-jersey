package com.poc.fileUpload.Angular.representation;

import java.sql.Blob;

public class FileUploadRepresentation {
	private int id;
	private String daFileName;
	private String daFileType;
	private Blob file;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDaFileName() {
		return daFileName;
	}
	public void setDaFileName(String daFileName) {
		this.daFileName = daFileName;
	}
	public String getDaFileType() {
		return daFileType;
	}
	public void setDaFileType(String daFileType) {
		this.daFileType = daFileType;
	}
	public Blob getFile() {
		return file;
	}
	public void setFile(Blob file) {
		this.file = file;
	}
	

}
