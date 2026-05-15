package com.sumit.automated_payroll_engine.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "salary_slips")
@Data
public class SalarySlip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "total_overtime_pay")
    private double totalOvertimePay;

    @Column(name = "tax_deduction")
    private double taxDeduction;

    @Column(name = "net_salary")
    private double netSalary;

    @Column(name = "processed_date")
    private LocalDate processedDate;
}