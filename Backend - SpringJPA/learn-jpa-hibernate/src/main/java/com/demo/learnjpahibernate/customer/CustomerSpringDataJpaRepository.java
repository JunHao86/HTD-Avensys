package com.demo.learnjpahibernate.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.learnjpahibernate.customer.Customer;

public interface CustomerSpringDataJpaRepository extends JpaRepository<Customer,Long>{

}
