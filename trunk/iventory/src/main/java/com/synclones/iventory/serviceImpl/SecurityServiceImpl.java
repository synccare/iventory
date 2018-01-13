package com.synclones.iventory.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.synclones.iventory.service.*;

@Service
public class SecurityServiceImpl implements SecurityService{

	@Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;
    
	@Override
	public String findLoggedInUsername() {
		Object userDetails = SecurityContextHolder.getContext().getAuthentication().getDetails();
		if(userDetails instanceof UserDetails){
			UserDetails details = ((UserDetails)userDetails);
			
			return ((UserDetails)userDetails).getUsername();
		}
		else{
			System.out.println("Not a instanceof UserDetails : "+ userDetails.toString());
		}
		return null;
	}

	@Override
	public void autologin(String username, String password) {
		System.out.println("Auto login");
		UserDetails userDetails = userDetailsService.loadUserByUsername(username);
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
		authenticationManager.authenticate(token);
		
		if(token.isAuthenticated()){
			SecurityContextHolder.getContext().setAuthentication(token);
			System.out.println("Auto login is sucsess");
		}
	}

}
