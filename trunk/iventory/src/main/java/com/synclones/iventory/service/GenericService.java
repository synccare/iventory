package com.synclones.iventory.service;

import java.io.Serializable;
import java.util.List;

public interface GenericService <T, PK extends Serializable>{

	List<T> getAll();
	
	T get(PK id);
	
	boolean existsObj(PK id);
	
	T save(T object);
	
	void remove(T object);
	
	void remove(PK id);

}
