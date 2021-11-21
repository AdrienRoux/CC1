package com.esgi.infrastructure;

import com.esgi.domain.models.Membership;
import com.esgi.domain.models.MembershipApplication;
import com.esgi.domain.validators.Predicate;
import com.esgi.services.PaymentService;

public class MembershipService {
    private final MembershipRepository repository;
    private final PaymentService paymentService;
    private final Predicate<MembershipApplication> membershipApplicationPredicate;

    public MembershipService(MembershipRepository repository, PaymentService paymentService, Predicate<MembershipApplication> membershipApplicationPredicate) {
        this.repository = repository;
        this.paymentService = paymentService;
        this.membershipApplicationPredicate = membershipApplicationPredicate;
    }

    public void add(MembershipApplication application) {
        if (membershipApplicationPredicate.validate(application) && paymentService.process()) {
            repository.add(new Membership(application.name, application.firstname, application.age));
        }
    }
}
