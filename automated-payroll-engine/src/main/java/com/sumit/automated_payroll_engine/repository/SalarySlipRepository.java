package com.sumit.automated_payroll_engine.repository;

import com.sumit.automated_payroll_engine.model.SalarySlip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalarySlipRepository extends JpaRepository<SalarySlip, Long> {
}