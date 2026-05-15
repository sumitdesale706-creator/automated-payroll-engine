package com.sumit.automated_payroll_engine.service;

import com.sumit.automated_payroll_engine.model.Employee;
import com.sumit.automated_payroll_engine.model.SalarySlip;
import com.sumit.automated_payroll_engine.repository.EmployeeRepository;
import com.sumit.automated_payroll_engine.repository.SalarySlipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PayrollService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SalarySlipRepository salarySlipRepository;

    public SalarySlip processPayroll(Long employeeId, double overtimeHours) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + employeeId));

        // 1. Calculate Overtime Pay
        double overtimePay = overtimeHours * employee.getHourlyOvertimeRate();

        // 2. Calculate Gross Salary
        double grossSalary = employee.getBaseSalary() + overtimePay;

        // 3. Logic-driven Tax Deduction (10% flat rate)
        double tax = grossSalary * 0.10;

        // 4. Calculate Net Salary
        double netSalary = grossSalary - tax;

        // 5. Automate record management
        SalarySlip slip = new SalarySlip();
        slip.setEmployeeId(employeeId);
        slip.setTotalOvertimePay(overtimePay);
        slip.setTaxDeduction(tax);
        slip.setNetSalary(netSalary);
        slip.setProcessedDate(LocalDate.now());

        return salarySlipRepository.save(slip);
    }
}