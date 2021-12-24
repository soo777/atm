package com.company;

import static org.junit.jupiter.api.Assertions.*;

class AtmTest {
    @org.junit.jupiter.api.Test
    void atmTest() {
        System.out.println("Create Card");

        String cardNo = "card01";
        String pinNumber = "0000";
        Card card = new Card(cardNo, pinNumber);

        System.out.println("Create Account \n");

        Account[] accountArr = new Account[3];

        accountArr[0] = new Account(cardNo, "account1", 100);
        accountArr[1] = new Account(cardNo, "account2", 200);
        accountArr[2] = new Account(cardNo, "account3", 300);

        // Insert Card
        System.out.println("Insert Card.");
        System.out.println("Insert Pin Number. \n");

        // Check Pin Number
        assertEquals(card.checkPinNumber("0000"), true);

        System.out.println("Select Account.");

        // Account List
        for (int i = 0; i < accountArr.length; i++) {
            accountArr[i].getAccountNo();
        }

        // Check Account account1
        String accountNo = "account1";
        Account account = null;
        for (int i = 0; i < accountArr.length; i++) {
            boolean check = accountArr[i].checkAccount(accountNo);
            if (check) {
                account = accountArr[i];
            }
        }
        account.selectAccount();

        // See balance
        account.getBalance();

        // Deposit
        account.deposit(100);

        // Withdraw
        account.withdraw(200);
    }
}
