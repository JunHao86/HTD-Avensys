package com.demo.learnjpahibernate.student.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.learnjpahibernate.student.Student;

public interface StudentSpringDataJpaRepository extends JpaRepository<Student, Long>{

}
