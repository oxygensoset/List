package com.company;

public class BasketDemo {
    public static void main(String[]agrs){
        Basket b1 = new Basket();
        Basket b2 = new Basket();
        Basket b3 = new Basket();

        System.out.println("b1: ");
        b1.pay(1200.0);
        System.out.println("b2: ");
        b2.pay("123456789");
        System.out.println("b3: ");
        b3.pay("987654321", "5500");
    }
}
