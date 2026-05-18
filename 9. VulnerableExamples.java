package com.codealpha.security;

public class VulnerableExamples {

    // SQL Injection Vulnerability
    public void sqlInjection(String username) {

        String query =
                "SELECT * FROM users WHERE username='"
                        + username + "'";

        System.out.println(query);
    }

    // Hardcoded Secret
    private static final String SECRET_KEY = "admin123";

    // Weak Hashing Example
    public void weakHashing(String password) {

        System.out.println(password.hashCode());
    }
}
