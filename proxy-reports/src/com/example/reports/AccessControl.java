package com.example.reports;

public class AccessControl {

    public boolean canAccess(User user, String classification) {
        String userRole = user.getRole();

        if ("PUBLIC".equals(classification)) return true;
        if ("FACULTY".equals(classification)) {
            return "FACULTY".equals(userRole) || "ADMIN".equals(userRole);
        }
        if ("ADMIN".equals(classification)) {
            return "ADMIN".equals(userRole);
        }
        return false;
    }
}