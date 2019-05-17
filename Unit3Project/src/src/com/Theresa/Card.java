package com.Theresa;

/**
 * This is part of the Payment Strategy pattern
 */
public class Card implements Payment {
    /**
     * Overrides display in Payment interface
     */
    @Override
    public void displayPayment() {
        System.out.println("Payment method: Credit/Debit Card");
    }
}
