package com.esgi.services;

import com.esgi.infrastructure.Logger;

public class StubPaymentService implements PaymentService{
    private Logger logger;

    public StubPaymentService(Logger logger) {
        this.logger = logger;
    }

    @Override
    public boolean process() {
        logger.log("Payment processed !");
        return true;
    }
}
