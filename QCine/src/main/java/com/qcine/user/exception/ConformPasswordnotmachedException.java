package com.qcine.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value=HttpStatus.NOT_ACCEPTABLE)
public class ConformPasswordnotmachedException  extends RuntimeException
{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	
	public ConformPasswordnotmachedException(String resourceName) {
		super(resourceName+"" +"Conform Password Not Mached ");
		this.resourceName = resourceName;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	
	
	

}
