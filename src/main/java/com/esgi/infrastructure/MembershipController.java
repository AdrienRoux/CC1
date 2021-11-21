package com.esgi.infrastructure;

import com.esgi.domain.models.MembershipApplication;

public class MembershipController {
    private final MembershipService service;

    public MembershipController(MembershipService service) {
        this.service = service;
    }

    public void add(MembershipApplication membershipApplication) {
        service.add(membershipApplication);
    }
}
