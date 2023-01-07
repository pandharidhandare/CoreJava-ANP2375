package com.ipl.cricket.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipl.cricket.sb.entity.Login;

public interface LoginRepository extends JpaRepository<Login,Integer> {

	public Login findByUserNameAndPassword(String userName,String password);
}
