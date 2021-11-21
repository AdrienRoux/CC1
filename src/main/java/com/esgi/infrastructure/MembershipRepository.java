package com.esgi.infrastructure;

import com.esgi.domain.models.Membership;

public interface MembershipRepository {
    void add(Membership membership);
}
