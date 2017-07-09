package com.poc.fileUpload.Angular.persister;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.poc.fileUpload.Angular.model.FileUploadModel;
@Mapper
public interface FileUploadMapper {

	@Select("SELECT ID, DAFILENAME , DAFILETYPE, DAFILE FROM FILE_UPLOAD")
	public List<FileUploadModel> getFile();
	
	@Insert("INSERT INTO FILE_UPLOAD (ID, DAFILENAME, DAFILETYPE, DAFILE) VALUES (#{id},#{fileUploadModel.daFileName},#{fileUploadModel.daFileType},"
			+ "#{fileUploadModel.daFile})")
	@SelectKey(statement="SELECT SEQ_FU_ID.NEXTVAL FROM DUAL", keyProperty="id", before = true, resultType = Integer.class)
	public void createFile(@Param("fileUploadModel") FileUploadModel fileUploadModel);

	@Select("SELECT DAFILENAME, DAFILETYPE, DAFILE FROM FILE_UPLOAD WHERE ID = #{id}")
	public FileUploadModel downloadFile(@Param("id") int id);
	
}
