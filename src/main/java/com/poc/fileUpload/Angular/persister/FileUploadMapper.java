package com.poc.fileUpload.Angular.persister;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.poc.fileUpload.Angular.model.FileUploadModel;
@Mapper
public interface FileUploadMapper {

	@Select("SELECT ID, DAFILENAME , DAFILETYPE, DAFILE FROM FILE_UPLOAD")
	public List<FileUploadModel> getFile();
	
	@Insert("INSERT INTO FILE_UPLOAD (ID, DAFILENAME, DAFILETYPE, DAFILE) VALUES (104,#{fileUploadModel.daFileName},#{fileUploadModel.daFileType},"
			+ "#{fileUploadModel.file})")
	public void createFile(@Param("fileUploadModel") FileUploadModel fileUploadModel);

	@Select("SELECT DAFILE FROM FILE_UPLOAD WHERE ID = #{id}")
	public FileUploadModel downloadFile(@Param("id") int id);
	
}
