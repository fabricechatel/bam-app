package com.bam.business;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
