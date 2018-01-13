package com.synclones.iventory.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.synclones.iventory.repository.LocationRepository;
import com.synclones.iventory.service.LocationService;
/**
 * 
 * @author nuwan @ SYNCLONES
 *
 */
@Service
@Component
public class LocationServiceImpl implements LocationService{

	@Autowired
	private LocationRepository locationRepository;

}
