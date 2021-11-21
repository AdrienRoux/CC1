package com.esgi.infrastructure;

import com.esgi.domain.models.Membership;

import java.util.ArrayList;
import java.util.List;

public class InMemoryMembershipRepository implements MembershipRepository{
    private List<Membership> memberships;

    public InMemoryMembershipRepository() {
        this.memberships = new ArrayList<>();
    }

    @Override
    public void add(Membership membership) {
        memberships.add(membership);
    }
}
