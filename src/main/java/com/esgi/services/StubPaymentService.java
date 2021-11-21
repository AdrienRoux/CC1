package com.esgi.services;

public class StubPaymentService implements PaymentService{

    @Override
    public boolean process() {
        return true;
    }
}
