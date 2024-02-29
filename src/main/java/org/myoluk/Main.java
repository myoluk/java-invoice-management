package org.myoluk;

import org.myoluk.service.CustomerServiceImpl;
import org.myoluk.service.InvoiceServiceImpl;
import org.myoluk.util.DataGenerator;

import java.time.Month;

public class Main {
    public static void main(String[] args) {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        InvoiceServiceImpl invoiceService = new InvoiceServiceImpl();

        DataGenerator dataGenerator = new DataGenerator();

        customerService.saveAll(dataGenerator.getCustomerList());
        invoiceService.saveAll(dataGenerator.getInvoiceList());

        System.out.println("--- All Customers ---");
        customerService.findAll().forEach(
                customer -> System.out.println(customer.toString())
        );

        char letterInName = 'C';
        System.out.println("\n--- Customers with <" + letterInName + "> in name ---");
        customerService.findAllByLetterInName(letterInName).forEach(
                customer -> System.out.println(customer.toString())
        );

        Month totalAmountMonth = Month.JUNE;
        System.out.println("\n--- Total amount of invoices for customers registered in <" + totalAmountMonth + "> ---");
        System.out.println(invoiceService.findTotalAmountByCustomerRegisterMonth(totalAmountMonth));

        System.out.println("\n--- All Invoices ---");
        invoiceService.findAll().forEach(
                invoice -> System.out.println(invoice.toString())
        );

        double amountAbove = 1500;
        System.out.println("\n--- Invoices with amount greater than <" + amountAbove + "> ---");
        invoiceService.findAllByAmountAbove(amountAbove).forEach(
                invoice -> System.out.println(invoice.toString())
        );

        System.out.println("\n--- Average amount of invoices above <" + amountAbove + "> ---");
        System.out.println(invoiceService.findAverageOfAmountAbove(amountAbove));

        double invoiceBelow = 500;
        System.out.println("\n--- Names of customers with invoice amount below <" + invoiceBelow + "> ---");
        invoiceService.findAllCustomersByAmountBelow(invoiceBelow).forEach(
                customer -> System.out.println(customer.toString())
        );

        Month avgMonth = Month.JUNE;
        double avgAmountBelow = 750;
        System.out.println("\n--- Sector of customers whose <" + avgMonth + "> invoices' average" +
                " is below <" + avgAmountBelow + "> ---");
        invoiceService.findAllCustomersByMonthAndAmountBelow(avgMonth, avgAmountBelow).forEach(
                customer -> System.out.println(
                        "* " + customer.getName() + " -> " + customer.getSector()
                )
        );
    }
}