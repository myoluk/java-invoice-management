package org.myoluk.util;

import org.myoluk.entity.Customer;
import org.myoluk.entity.Invoice;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    private final List<Customer> customerList = new ArrayList<>();
    private final List<Invoice> invoiceList = new ArrayList<>();

    public DataGenerator() {
        create();
    }

    private void create() {
        Customer c1 = new Customer(1L, LocalDate.of(2023, Month.JUNE, 1), "Bob", "Uncle", "Technology");
        Customer c2 = new Customer(2L, LocalDate.of(2023, Month.JUNE, 2), "Alice", "Aunt", "Finance");
        Customer c3 = new Customer(3L, LocalDate.of(2023, Month.JUNE, 3), "David", "Nephew", "Technology");
        Customer c4 = new Customer(4L, LocalDate.of(2023, Month.JUNE, 4), "Chen", "Chun", "Technology");
        Customer c5 = new Customer(5L, LocalDate.of(2023, Month.JANUARY, 25), "Sam", "Son", "Retail");

        Invoice i1 =  new Invoice(1L, LocalDate.of(2023, Month.JUNE, 1), c1, 400);
        Invoice i2 =  new Invoice(2L, LocalDate.of(2023, Month.JUNE, 2), c2, 2000);
        Invoice i3 =  new Invoice(3L, LocalDate.of(2023, Month.JUNE, 3), c3, 350);
        Invoice i4 =  new Invoice(4L, LocalDate.of(2023, Month.JUNE, 4), c4, 800);
        Invoice i5 =  new Invoice(5L, LocalDate.of(2023, Month.JANUARY, 25), c5, 1700);

        customerList.addAll(List.of(c1, c2, c3, c4, c5));
        invoiceList.addAll(List.of(i1, i2, i3, i4, i5));
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }
}
