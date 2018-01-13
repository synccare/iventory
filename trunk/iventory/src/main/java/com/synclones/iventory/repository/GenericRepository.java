package com.synclones.iventory.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;

@Component
public interface GenericRepository<T, PK extends Serializable>{

	List<T> getAll();
	
	T get(PK id);
	
	boolean existsObj(PK id);
	
	T save(T object);
	
	void remove(T object);
	
	void remove(PK id);
}
