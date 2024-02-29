package org.myoluk.service;

import org.myoluk.entity.Customer;
import org.myoluk.entity.Invoice;

import java.time.Month;
import java.util.List;

public interface InvoiceService {
    void save(Invoice invoice);
    void saveAll(List<Invoice> invoices);
    List<Invoice> findAll();
    Double findTotalAmountByCustomerRegisterMonth(Month month);
    List<Invoice> findAllByAmountAbove(Double amount);
    Double findAverageOfAmountAbove(Double amount);
    List<Customer> findAllCustomersByAmountBelow(Double amount);
    List<Customer> findAllCustomersByMonthAndAmountBelow(Month month, Double amount);
}
