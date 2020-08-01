package com.manu.designpattern.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(500);
        CreditCard creditCard = creditCardFactory.getCreditCard(CardType.GOLD);

        System.out.println(creditCard.getClass());

        creditCardFactory = CreditCardFactory.getCreditCardFactory(800);
        CreditCard creditCard1 =  creditCardFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(creditCard1.getClass());
    }
}
