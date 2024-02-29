package org.myoluk.entity;

import org.myoluk.general.BaseEntity;

import java.time.LocalDate;

public class Invoice implements BaseEntity {
    private final Long id;
    private LocalDate date;
    private Customer customer;
    private double amount;

    public Invoice(Long id, LocalDate date, Customer customer, double amount) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.amount = amount;
    }

    @Override
    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "* date=" + date +
                ", customer=" + customer.getName() +
                ", amount=" + amount;
    }
}
