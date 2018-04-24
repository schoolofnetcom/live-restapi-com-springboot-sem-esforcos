package com.schoolofnet.liveRestAPI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String field;
	private Object value;
	
	public NotFoundException(String name, String field, Object value) {
		super(String.format("%s could not found %s: %s", name, field, value));
		
		this.setField(field);
		this.setName(name);
		this.setValue(value);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
