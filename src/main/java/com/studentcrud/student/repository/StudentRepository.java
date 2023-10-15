package com.studentcrud.student.repository;

import com.studentcrud.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student,Long> { }
