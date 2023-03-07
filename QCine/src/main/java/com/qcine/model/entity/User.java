package com.qcine.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int userId;
	@Column(unique=true)
    private String userName;
	private String userPassword;
	@Column(unique=true)
    private String userEmail;
    private  int userAge;
    private String userGender;
    private long userPhoneNo;
    
    
    @OneToOne(fetch = FetchType.EAGER  ,cascade = CascadeType.ALL)
    @JoinColumn(name="addId")
    private UserAddressEntity address;


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public int getUserAge() {
		return userAge;
	}


	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}


	public String getUserGender() {
		return userGender;
	}


	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}


	public long getUserPhoneNo() {
		return userPhoneNo;
	}


	public void setUserPhoneNo(long userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}


	public UserAddressEntity getAddress() {
		return address;
	}


	public void setAddress(UserAddressEntity address) {
		this.address = address;
	}
    
    
    

    
    
}
