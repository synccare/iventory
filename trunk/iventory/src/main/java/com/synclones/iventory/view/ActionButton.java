package com.synclones.iventory.view;


import org.displaytag.decorator.TableDecorator;

import com.synclones.iventory.model.User;


/**
 * nuwan @ SYNCLONES Dec 24, 2017 T 11:30:40 AM
 */
public class ActionButton extends TableDecorator {

	public String getUserAction() {
		System.out.println(getCurrentRowObject());
		Object user = new User();
		System.out.println("--------------------------");
		try{
			user = (Object) getCurrentRowObject();
		}
		catch(Exception e){
			System.err.println(e.toString());
			user = new User();
		}
		user = (User) user;
		System.out.println(user.toString());
		String view = "<button class='btn btn-success btn-sm' onclick='getUserAction("+user+", \"view\");' data-toggle='tooltip' title='View'><i class='fa fa-eye'></i></button>";
		String edit = "<button class='btn btn-primary btn-sm' onclick='getUserAction("+user+",\"edit\");' data-toggle='tooltip' title='Edit'><i class='fa fa-pencil'></i></button>";
		String delete = "<button class='btn btn-danger btn-sm' onclick='getUserAction("+user+",\"delete\");' data-toggle='tooltip' title='Delete'><i class='fa fa-times'></i></button>";
    	
		return view + edit + delete;
	}
	
	public String getUserCredentials(){
		User user ;
		try{
			user = (User) getCurrentRowObject();
		}
		catch(Exception e){
			user = new User();
		}
		System.out.println(user.toString());
		String enabled = "<span class='label label-success'>Enable</span>";
		String isActive = "<span class='label label-success'>Active</span>";
		String accountExpired = "<span class='label label-success'>Not Expired</span>";
		String accountLocked = "<span class='label label-success'>Unlock</span>";
		String credentialsExpired = "<span class='label label-success'>Credentials</span>";
		if(!user.isEnabled()){
			enabled = "<span class='label label-danger'>Disable</span>";
		}
		if (!user.getIsActive()) {
			isActive = "<span class='label label-danger'>Deactive</span>";
		}
		if (user.isAccountNonExpired()) {
			accountExpired = "<span class='label label-danger'>Expired</span>";
		}
		if (user.isAccountNonLocked()) {
			accountLocked = "<span class='label label-danger'>Locked</span>";
		}
		if (user.isCredentialsNonExpired()) {
			credentialsExpired = "<span class='label label-danger'>Credentials</span>";
		}
		return enabled + isActive +"</br>"+ accountExpired + accountLocked + credentialsExpired;
		 
	}
}
