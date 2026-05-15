package com.sumit.automated_payroll_engine.controller;

import com.sumit.automated_payroll_engine.model.SalarySlip;
import com.sumit.automated_payroll_engine.service.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payroll")
public class PayrollController {

    @Autowired
    private PayrollService payrollService;

    // Endpoint to trigger the automated disbursement logic
    @PostMapping("/run/{id}")
    public SalarySlip runPayroll(@PathVariable Long id, @RequestParam double overtimeHours) {
        return payrollService.processPayroll(id, overtimeHours);
    }
}