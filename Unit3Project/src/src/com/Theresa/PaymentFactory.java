package com.Theresa;
/**
 * This a Factory Pattern for all payments
 */
public class PaymentFactory {

    public Payment getPaymentType(PaymentType paymentType) {

        switch (paymentType) {
            case CASH: return new Cash();
            case CARD: return new Card();
            default: return null;
        }
    }
}
