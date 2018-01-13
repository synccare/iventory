package com.synclones.iventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.synclones.iventory.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

	@Query("SELECT u FROM User u WHERE u.firstName LIKE %?1% OR u.lastName LIKE %?1% OR u.email LIKE %?1% OR u.phoneNumber LIKE %?1% OR u.epfNumber LIKE %?1%")
	List<User> findBy(String query);

}
