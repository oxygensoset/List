package com.company;

public class Basket {

        void pay(double money) {
            System.out.println("Оплата наличным:" + money);
        }

        void pay(String cardNum) {
            System.out.println("Оплачено по кредитной карте #" + cardNum);
        }

        void pay(String accountNum, String bankCode) {
            System.out.println("Переведено на счет #" + accountNum +"в банке" + bankCode);

        }

    }



