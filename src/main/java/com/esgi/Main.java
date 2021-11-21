package com.esgi;

import com.esgi.domain.models.MembershipApplication;
import com.esgi.domain.validators.MembershipValidator;
import com.esgi.infrastructure.InMemoryMembershipRepository;
import com.esgi.infrastructure.MembershipService;
import com.esgi.infrastructure.Membershipcontroller;
import com.esgi.services.StubPaymentService;

public class Main {
    public static void main(String[] args) {
        var membershipRepo = new InMemoryMembershipRepository();
        var membershipValidator = new MembershipValidator();
        var stubPaymentService = new StubPaymentService();

        var membershipService = new MembershipService(membershipRepo, stubPaymentService, membershipValidator);
        var membershipController = new Membershipcontroller(membershipService);

        var membershipApplication = new MembershipApplication();

        membershipApplication.name = "Test";
        membershipApplication.firstname = "Test";
        membershipApplication.age = 18;

        var membershipApplication2 = new MembershipApplication();

        membershipApplication2.name = "Test";
        membershipApplication2.firstname = "Test";
        membershipApplication2.age = 19;

        membershipController.add(membershipApplication);
        membershipController.add(membershipApplication2);
    }
}
