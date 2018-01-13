package com.synclones.iventory.serviceImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.synclones.iventory.repository.GenericRepository;
import com.synclones.iventory.service.GenericService;


/**
 * nuwan @ SYNCLONES
 * Jan 10, 2018 T 10:30:13 AM
 */
@Service
@Component
public class GenericServiceImpl<T, PK extends Serializable>{
/*
//	@Autowired
	protected GenericRepository<T, PK> genericRepository;
	
//	@Autowired
	public GenericServiceImpl(GenericRepository<T, PK> genericRepository) {
		super();
		this.genericRepository = genericRepository;
	}

	@Override
	public List<T> getAll() {
		return this.genericRepository.getAll();
	}

	@Override
	public T get(PK id) {
		return (T)this.genericRepository.get(id);
	}

	@Override
	public boolean existsObj(PK id) {
		T entity = (T) this.get(id);
        return entity != null;
	}

	@Override
	public T save(T object) {
		return genericRepository.save(object);
	}

	@Override
	public void remove(T object) {
		genericRepository.remove(object);
	}

	@Override
	public void remove(PK id) {
		genericRepository.remove(id);
	}*/
}
