package com.ipl.cricket.sb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipl.cricket.sb.entity.Login;
import com.ipl.cricket.sb.repository.LoginRepository;
import com.ipl.cricket.sb.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	@Override
	public Login loginUser(String userName, String password) {
		
		Login login=loginRepository.findByUserNameAndPassword(userName, password);
		return login;
	}

}
