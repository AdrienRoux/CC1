package com.esgi.domain.validators;

import com.esgi.domain.models.MembershipApplication;
import com.esgi.infrastructure.ConsoleLogger;
import com.esgi.infrastructure.Logger;

public class MembershipValidator implements Predicate<MembershipApplication> {
    private Logger logger;

    public MembershipValidator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public boolean validate(MembershipApplication entity) {
        if (entity.age > 18) {
            logger.log("Valid Member");
        } else {
            logger.log("Invalid Member");
        }
        return entity.age > 18;
    }
}
