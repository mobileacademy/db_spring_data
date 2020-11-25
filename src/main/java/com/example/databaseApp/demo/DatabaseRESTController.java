package com.example.databaseApp.demo;

import com.example.databaseApp.demo.models.Customer;
import com.example.databaseApp.demo.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DatabaseRESTController {
    @Autowired
    CustomerRepository myRepo;

    @Autowired
    PersonRepository myPersonRepo;

    @RequestMapping("/")
    String home() {
        return "my app today";
    }


    @GetMapping("/user")
    public Iterable<Customer> myCustomers(){
        return myRepo.findAll();
    }

    @GetMapping("/person")
    public Iterable<Person> myPerson(){
        return myPersonRepo.findAll();
    }

    @PostMapping("/addCustomer")
    public String addCustomer(String email, String Name){

        Customer customer = new Customer();
        //customer.setId(3333);
        customer.setEmail("test");
        customer.setName("Iliescu");
        myRepo.save(customer);
        return "SAVED";
    }
}
