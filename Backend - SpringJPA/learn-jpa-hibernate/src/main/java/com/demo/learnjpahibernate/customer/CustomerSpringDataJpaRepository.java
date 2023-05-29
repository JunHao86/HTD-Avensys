package com.demo.learnjpahibernate.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.learnjpahibernate.customer.Customer;

/* Week 6 - Day 1
 * Completed on 2023/05/29
 */

public interface CustomerSpringDataJpaRepository extends JpaRepository<Customer,Long>{

}
