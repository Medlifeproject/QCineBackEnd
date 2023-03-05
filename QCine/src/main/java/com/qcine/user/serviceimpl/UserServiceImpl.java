package com.qcine.user.serviceimpl;

import java.util.function.BiFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qcine.model.entity.User;
import com.qcine.user.exception.ConformPasswordnotmachedException;
import com.qcine.user.exception.InvaledEmailORPasswordException;
import com.qcine.user.exception.InvaledemailIdException;
import com.qcine.user.exception.UserNameAllReadyExistException;
import com.qcine.user.repository.UserRepoInter;
import com.qcine.user.service.UserServiceInter;

@Service
public class UserServiceImpl  implements UserServiceInter
{
	@Autowired
	  UserRepoInter userrepo;

	
//--------------->	SignUp  <-------------------
//---------------<	        >-------------------
	@Override
	public Object saveUser(User ue) 
	{
		     
		String usen = userrepo.findByUseremailSignup(ue.getUserEmail());
		String usent = userrepo.findByUsernameSignup(ue.getUserName());
		
		if (usen == null && usent == null) {
			User u = userrepo.save(ue);
			return u;
		} else {
			try {
				throw new UserNameAllReadyExistException("User", "ue", ue);
			} catch (UserNameAllReadyExistException e) {
				System.out.println(e);
				return e.getMessage();
			}
		}
	}
//--------------->	Login  <-------------------
//---------------<	        >-------------------


	@Override
	public Object userLogin(String email, String password) 
	{
		User ep = userrepo.findByUserLogin(email, password);
		
      if (ep != null) {
			System.out.println(ep);
			if (ep.getUserPassword().equals(password)) {
				return ep;
		   } else {
			   try {
					throw new InvaledEmailORPasswordException("User", "password",password);
			 }  catch (InvaledEmailORPasswordException ee) {
					System.out.println(ee );
					return ee.getMessage();
				  }
			   }
          } else {
			try {
				throw new InvaledEmailORPasswordException("user", "email", email);
			} catch (InvaledEmailORPasswordException ee) {
				System.out.println(ee );
				return ee.getMessage();
			}
		}
	}
	
//--------------->	Forget Password  <-------------------
//---------------<	                 >-------------------

    @Override
	public Object userForgetPassword(String email, String password, String conformPass) 
	{
		   User u = userrepo.findByUserforgetpassword(email);

			if (u != null) {
				if (u.getUserPassword() != password && password.equals(conformPass)) {

					u.setUserPassword(password);
					return userrepo.save(u);

				} else {
					try {
						throw new ConformPasswordnotmachedException(conformPass);
					} catch (ConformPasswordnotmachedException cp) {
						System.out.println(cp);
						return cp.getMessage();
					}
				}
			} else {
				try {
					throw new InvaledemailIdException(email);
				} catch (InvaledemailIdException ie) {
					System.out.println(ie);
					return ie.getMessage();
				}
			}

		}
}