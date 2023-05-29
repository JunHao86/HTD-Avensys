package com.demo.learnjpahibernate.student.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.learnjpahibernate.student.Student;

/* Week 6 - Day 1
 * Completed on 2023/05/29
 */

public interface StudentSpringDataJpaRepository extends JpaRepository<Student, Long>{

}
