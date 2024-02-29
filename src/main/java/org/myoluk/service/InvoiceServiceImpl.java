package org.myoluk.service;

import org.myoluk.entity.Customer;
import org.myoluk.entity.Invoice;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class InvoiceServiceImpl implements InvoiceService {
    private static final List<Invoice> invoiceList = new ArrayList<>();

    public void save(Invoice invoice) {
        invoiceList.add(invoice);
    }

    public void saveAll(List<Invoice> invoices) {
        invoiceList.addAll(invoices);
    }

    public List<Invoice> findAll() {
        return new ArrayList<>(invoiceList);
    }

    public Double findTotalAmountByCustomerRegisterMonth(Month month) {
        return invoiceList.stream()
                .filter(invoice -> invoice.getCustomer().getRegisterDate().getMonth() == month)
                .mapToDouble(Invoice::getAmount)
                .sum();
    }

    public List<Invoice> findAllByAmountAbove(Double amount) {
        return invoiceList.stream()
                .filter(invoice -> invoice.getAmount() > amount)
                .toList();
    }

    public Double findAverageOfAmountAbove(Double amount) {
        return invoiceList.stream()
                .filter(invoice -> invoice.getAmount() > amount)
                .mapToDouble(Invoice::getAmount)
                .average()
                .orElse(0);
    }

    public List<Customer> findAllCustomersByAmountBelow(Double amount) {
        return invoiceList.stream()
                .filter(invoice -> invoice.getAmount() < amount)
                .map(Invoice::getCustomer)
                .toList();
    }

    public List<Customer> findAllCustomersByMonthAndAmountBelow(Month month, Double amount) {
        return invoiceList.stream()
                .filter(invoice -> invoice.getDate().getMonth() == month)
                .filter(invoice -> invoice.getAmount() < amount)
                .map(Invoice::getCustomer)
                .toList();
    }
}
