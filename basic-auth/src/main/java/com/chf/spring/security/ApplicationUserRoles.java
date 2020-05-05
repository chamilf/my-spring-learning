package com.chf.spring.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.chf.spring.security.ApplicationPermissions.*;

public enum ApplicationUserRoles {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, COURSE_WRITE));

    private final Set<ApplicationPermissions> permissions;

    ApplicationUserRoles(Set<ApplicationPermissions> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationPermissions> getPermissions() {
        return permissions;
    }
}
