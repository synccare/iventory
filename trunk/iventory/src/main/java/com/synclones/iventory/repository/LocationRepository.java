package com.synclones.iventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.synclones.iventory.model.Location;

/**
 * 
 * nuwan @ SYNCLONES Jan 6, 2018 T 2:16:48 PM
 *
 *
 */
@Component
public interface LocationRepository extends JpaRepository<Location, Long> {

}
