package com.minera.minera.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minera.minera.models.SensorData;

@Repository
public interface SensorDataRepository extends JpaRepository<SensorData, Integer>{

}
