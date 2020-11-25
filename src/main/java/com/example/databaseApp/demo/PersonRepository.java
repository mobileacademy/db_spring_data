package com.example.databaseApp.demo;

import com.example.databaseApp.demo.models.Customer;
import com.example.databaseApp.demo.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
