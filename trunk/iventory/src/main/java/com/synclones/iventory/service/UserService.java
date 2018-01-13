package com.synclones.iventory.service;

import java.util.List;

import com.synclones.iventory.model.User;

/**
*
* Copyright &copy; Synclones (Pvt) Ltd <http://www.synclones.com>, - All Rights Reserved.
* Unauthorized copying of this file, via any medium is strictly prohibited.
* Proprietary and confidential.
*
* Description of Location:
*
* Modifications:
*
* @version Revision: 1.0
*
*/
 
public interface UserService {

	void save(User user);
	
	User findByUsername(String username);
	
	List<User> getAll();

	List<User> findBy(String query);

}
