package org.myoluk.service;

import org.myoluk.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private static final List<Customer> customerList = new ArrayList<>();

    public void save(Customer customer) {
        customerList.add(customer);
    }

    public void saveAll(List<Customer> customers) {
        customerList.addAll(customers);
    }

    public List<Customer> findAll() {
        return new ArrayList<>(customerList);
    }

    public List<Customer> findAllByLetterInName(char letter) {
        return customerList.stream()
                .filter(customer -> customer.getName().toLowerCase().contains(
                        String.valueOf(letter).toLowerCase()
                )).toList();
    }
}
