package com.minera.minera.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minera.minera.models.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
