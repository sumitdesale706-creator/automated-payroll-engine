package com.sumit.automated_payroll_engine.repository;

import com.sumit.automated_payroll_engine.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}