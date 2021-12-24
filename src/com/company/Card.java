package com.company;

public class Card {
    private String cardNo = "";
    private String pinNumber = "";

    Card(String cardNo, String pinNumber) {
        this.cardNo = cardNo;
        this.pinNumber = pinNumber;
    }

    boolean checkPinNumber(String pinNumber) {
        if (pinNumber == this.pinNumber) {
            return true;
        } else {
            return false;
        }
    }
}
