package com.va.week4.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.va.week4.Student;

public interface StudentRepoInterface extends JpaRepository<Student, Integer> {

}
