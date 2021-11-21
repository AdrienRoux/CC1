package com.esgi.domain.validators;

import com.esgi.domain.models.MembershipApplication;

public class MembershipValidator implements Predicate<MembershipApplication> {

    @Override
    public boolean validate(MembershipApplication entity) {
        return entity.age > 18;
    }
}
