package com.biharcivilwebservice.project.pojos;

import java.util.List;

import org.springframework.http.HttpStatus;

public class ResponseWrapper {

	private String datetime;
	private HttpStatus code;
	private String message;
	private String issues;
	private List data;
	
	public ResponseWrapper(String datetime, HttpStatus code, String message, String issues, List data) {
		super();
		this.datetime = datetime;
		this.code = code;
		this.message = message;
		this.issues = issues;
		this.data = data;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public HttpStatus getCode() {
		return code;
	}

	public void setCode(HttpStatus code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getIssues() {
		return issues;
	}

	public void setIssues(String issues) {
		this.issues = issues;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}
	
	
	
}
