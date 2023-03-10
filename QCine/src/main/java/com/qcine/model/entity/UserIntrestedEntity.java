package com.qcine.model.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Transactional
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserIntrestedEntity
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int intId;
	private List<String> diseces;

	
	

}
