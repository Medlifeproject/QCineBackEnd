package com.qcine.user.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qcine.model.entity.User;

@Repository
public interface UserRepoInter extends JpaRepository<User, Integer>
{
	//SignUp
	@Query(value="select * from user where user_name=?1  ",nativeQuery=true)
    String findByUsernameSignup(String  un  );
	
	@Query(value="select * from user where user_email=?1",nativeQuery=true)
    String findByUseremailSignup(String  e);
	
	
	//Login 
	
	@Query(value="select * from user where user_name=?1 or user_email=?2",nativeQuery=true)
	User findByUsernameorEmail(String username,String email);


	
	//forgetpassword
	@Query(value="select * from user where user_email=?1",nativeQuery=true)
	public User findByUserforgetpassword( String email);

	
}

