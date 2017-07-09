package com.poc.fileUpload.Angular.model;

import java.io.InputStream;
import java.sql.Blob;

public class FileUploadModel {
	private int id;
	private String daFileName;
	private String daFileType;
	private InputStream daFile;
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
	public InputStream getDaFile() {
		return daFile;
	}
	public void setDaFile(InputStream daFile) {
		this.daFile = daFile;
	}
	@Override
	public String toString() {
		return "FileUploadModel [id=" + id + ", daFileName=" + daFileName + ", daFileType=" + daFileType + ", daFile="
				+ daFile + "]";
	}
	
	
}
