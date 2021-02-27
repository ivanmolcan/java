package oop.interfaceSegregationPrinciple;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {

    private List<Product> products;

    private Customer customer;

    public CustomerTransaction(List<Product> products, Customer customer) {
        this.products = products;
        this.customer = customer;
    }

    @Override
    public String getName(){
        return customer.getName();
    }

    @Override
    public Date getDate(){
        return new Date();
    }

    @Override
    public String productBreakDown(){
        return "list of products for reporting";
    }

    @Override
    public void prepareInvoice(){
        System.out.println("invoice prepared...");
    }

    @Override
    public void chargeCustomer(){
        System.out.println("charged the customer");
    }

}
