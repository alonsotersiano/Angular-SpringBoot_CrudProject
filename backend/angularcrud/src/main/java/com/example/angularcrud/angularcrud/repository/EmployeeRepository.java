package com.example.angularcrud.angularcrud.repository;

import com.example.angularcrud.angularcrud.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
