package com.infinite.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infinite.Project.pojo.Attendance;

public interface IAttendanceRepo extends JpaRepository<Attendance, Long> {

}
