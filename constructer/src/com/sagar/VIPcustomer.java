package com.sagar;

public class VIPcustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIPcustomer(){
        this("Default name",50000.0,"default@gmail.com");
    }

    public VIPcustomer(String name, double creditLimit) {
        this(name,creditLimit,"unknown@gmail.com");
    }

    public VIPcustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
