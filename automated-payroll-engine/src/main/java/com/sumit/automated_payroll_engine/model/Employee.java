package com.sumit.automated_payroll_engine.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employees")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "base_salary")
    private double baseSalary;

    @Column(name = "hourly_overtime_rate")
    private double hourlyOvertimeRate;
}