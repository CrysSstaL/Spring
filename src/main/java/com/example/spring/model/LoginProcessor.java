package com.example.spring.model;

import com.example.spring.service.LoggedUserManagementService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private final LoggedUserManagementService loggedUserManagementService;
    private String username;
    private String password;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public boolean login() {
        String username = this.getUsername();
        String password = this.getPassword();

        boolean loginResult = false;
        if ("natalie".equals(username) && "password".equals(password)) {
            loginResult = true;
            loggedUserManagementService.setUsername(username);
        }
        return loginResult;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String u){
        username = u;
    }

    public void setPassword(String p){
        password = p;
    }

// геттеры и сеттеры
}
