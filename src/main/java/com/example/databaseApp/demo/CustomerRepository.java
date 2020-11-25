package com.example.databaseApp.demo;

import com.example.databaseApp.demo.models.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
