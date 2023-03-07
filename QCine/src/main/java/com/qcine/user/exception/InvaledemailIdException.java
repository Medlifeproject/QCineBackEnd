package com.qcine.user.exception;




public class InvaledemailIdException  extends RuntimeException
{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
     private String resourceName;

    public InvaledemailIdException(String resourceName) {
	    super(resourceName+" "+"Inavaled Email Id ");
	this.resourceName = resourceName;
}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
    
	

	
}
