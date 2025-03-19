package com.minera.minera.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minera.minera.models.Sensor;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Integer>{

}
