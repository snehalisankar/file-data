package com.springfiledata.filedata.data;

import org.springframework.stereotype.Component;

public class FileData {

	private String name;
	private String address;

	public String getName() {
		return name;
	}

	public FileData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FileData(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
