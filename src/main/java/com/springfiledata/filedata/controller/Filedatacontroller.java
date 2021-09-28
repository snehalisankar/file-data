package com.springfiledata.filedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springfiledata.filedata.data.FileData;
import com.springfiledata.filedata.config.FileConfiguration;

@RestController
public class Filedatacontroller {

	@Autowired
	private FileConfiguration FileConfiguration;
	
	@GetMapping("file-data")
	public FileData getFileData() {
		
		return new FileData(FileConfiguration.getName(),FileConfiguration.getAddress());
	}
}
