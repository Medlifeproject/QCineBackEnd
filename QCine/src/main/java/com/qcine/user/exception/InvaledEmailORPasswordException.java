package com.qcine.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class InvaledEmailORPasswordException extends RuntimeException
{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldNmae;
	private Object fieldValue;
	public InvaledEmailORPasswordException(String resourceName, String fieldNmae, Object fieldValue) {
		super(resourceName+" "+": Invalid Email or Password ");
		this.resourceName = resourceName;
		this.fieldNmae = fieldNmae;
		this.fieldValue = fieldValue;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFieldNmae() {
		return fieldNmae;
	}
	public void setFieldNmae(String fieldNmae) {
		this.fieldNmae = fieldNmae;
	}
	public Object getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(Object fieldValue) {
		this.fieldValue = fieldValue;
	}
	
	
	
	
	

}
