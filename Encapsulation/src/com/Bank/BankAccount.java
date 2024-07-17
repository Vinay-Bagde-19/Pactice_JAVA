package com.Bank;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public void depositMoney(double money){
        if (money <= 0){
            System.out.println("Invalid Deposit");
        }else {
            balance += money;
        }
    }

    public double withdrawMoney(double money){
        if (money <= 0){
            System.out.println("Invalid Withdraw");
        }else if (balance >= money){
            balance -= money;
        }
        else {
            money = balance;
            balance = 0;
        }
        return money;
    }
}
