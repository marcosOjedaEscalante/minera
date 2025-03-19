package com.minera.minera.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minera.minera.models.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String>{

}
