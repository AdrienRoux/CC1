package com.esgi.infrastructure;

import com.esgi.domain.models.MembershipApplication;

public class Membershipcontroller {
    private MembershipService service;

    public Membershipcontroller(MembershipService service) {
        this.service = service;
    }

    public void add(MembershipApplication membershipApplication){
        service.add(membershipApplication);
    }
}
