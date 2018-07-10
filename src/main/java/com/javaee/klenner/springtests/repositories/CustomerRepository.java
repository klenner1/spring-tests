package com.javaee.klenner.springtests.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javaee.klenner.springtests.domain.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>{

}
