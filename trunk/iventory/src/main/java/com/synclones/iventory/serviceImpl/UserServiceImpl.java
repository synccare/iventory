package com.synclones.iventory.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.synclones.iventory.model.User;
import com.synclones.iventory.repository.RoleRepository;
import com.synclones.iventory.repository.UserRepository;
import com.synclones.iventory.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@Override
	public void save(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setRoles(new HashSet<>(roleRepository.findByRoleName("USER")));
		userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		System.out.println(username);
		return userRepository.findByUsername(username);
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public List<User> findBy(String query) {
		return userRepository.findBy(query);
	}

	
}
