package com.manu.designpattern.abstractfactory;

public class VisaFactory extends CreditCardFactory {
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaPlatinumCreditCard();
            default: return null;
        }
    }
}
