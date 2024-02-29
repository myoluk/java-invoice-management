package org.myoluk.service;

import org.myoluk.entity.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);
    void saveAll(List<Customer> customers);
    List<Customer> findAll();
    List<Customer> findAllByLetterInName(char letter);
}
