package com.employee.EmployeeManagement.Dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.EmployeeManagement.Entity.Employee;


@Repository
public interface EmployeeDao extends CrudRepository<Employee,Integer> {
    
}
