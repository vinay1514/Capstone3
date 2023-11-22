package com.infinite.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infinite.Project.pojo.Payroll;

public interface IPayrollRepo extends JpaRepository<Payroll, Long> {

}
