package com.example.demo.repo;

import com.example.demo.domain.Tour;
import org.springframework.data.repository.CrudRepository;


/**
 * Tour Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourRepository extends CrudRepository<Tour, Integer> {
}
