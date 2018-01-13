package com.synclones.iventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.synclones.iventory.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	@Query("SELECT r FROM Role r WHERE r.name LIKE ?1")
	List<Role> findByRoleName(String roleName);
}
