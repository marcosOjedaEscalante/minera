package com.minera.minera.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minera.minera.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{

}
