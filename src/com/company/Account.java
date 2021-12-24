package com.company;

public class Account {
    private String cardNo = "";
    private String accountNo = "";
    private Integer balance = 0;

    Account(String cardNo, String accountNo, Integer balance) {
        this.cardNo = cardNo;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void getAccountNo() {
        System.out.println(this.accountNo);
    }

    public boolean checkAccount(String accountNo) {
        if (accountNo.equals(this.accountNo)) return true;
        return false;
    }

    public void selectAccount() {
        System.out.println("Selected account : " + this.accountNo + ", balance : " + this.balance);
    }

    public void getBalance() {
        System.out.println("balance : " + this.balance);
    }

    public void deposit(Integer amount) {
        this.balance = this.balance + amount;
        System.out.println("Complete deposit. After balance : " + this.balance);
    }

    public void withdraw(Integer amount) {
        if (amount > this.balance) {
            System.out.println("Fail withdraw. Withdraw amount is greater than balance.");
            return;
        }
        this.balance = this.balance - amount;
        System.out.println("Complete withdraw. After balance : " + this.balance);
    }
}
