package com.qcine.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@ResponseStatus(value=HttpStatus.ALREADY_REPORTED)

public class UserNameAllReadyExistException  extends RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
      private String resourceName;
      private String fieldName;
      private Object  fieldValue;
	public UserNameAllReadyExistException(String resourceName, String fieldName, Object fieldValue) {
		super(resourceName+" " +" Is All Ready Exist/Invaled user " );
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
      
}
