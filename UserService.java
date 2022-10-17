package com.gl.LoginAuthentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.gl.LoginAuthentication.bean.MyUser;
import com.gl.LoginAuthentication.dao.UserRepository;

@Service 
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		return repository.findById(userId).get();
	}
	public void save(MyUser user) {
		repository.save(user);
	}
}
