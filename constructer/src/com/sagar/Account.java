package com.sagar;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public Account(){
        this("12345",200.0,"Sagar Kumar","sagar.kr1910@gmail.com","217434");
        System.out.println("Empty Constructer");
    }
    public Account(String accountNumber,double balance,String customerName,String email,String phoneNumber){
        System.out.println("Constructor with parameter");
       this.accountNumber = accountNumber;
       this.balance = balance;
       this.customerName = customerName;
       this.email = email;
       this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this("9999",1000.5,customerName,email,phoneNumber);

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void withdraw( double amount){
        if(balance-amount<=0){
            System.out.println("Withdraw not possible due to low balance.Your current balance is "+balance);
        }else {
            balance = balance-amount;
            System.out.println("Withdraw successful.Current balnace is "+balance);
        }
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposit successful.Your current balance is "+balance);
    }

}
