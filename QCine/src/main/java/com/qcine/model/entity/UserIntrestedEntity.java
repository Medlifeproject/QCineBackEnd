package com.qcine.model.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;

@Transactional
@Entity
public class UserIntrestedEntity
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int intId;
	private List<String> diseces;
	public int getIntId() {
		return intId;
	}
	public void setIntId(int intId) {
		this.intId = intId;
	}
	public List<String> getDiseces() {
		return diseces;
	}
	public void setDiseces(List<String> diseces) {
		this.diseces = diseces;
	}
	
	

}
