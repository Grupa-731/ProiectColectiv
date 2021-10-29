package com.example.proiectcolectiv.appuser;

import java.util.Collection;

public class AppUser{

    private int id;
    private String name;
    private String password;
    private String email;
    private AppUserRole appUserRole;

    public AppUser(String name,String password,String email,AppUserRole appUserRole) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.appUserRole = appUserRole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AppUserRole getAppUserRole() {
        return appUserRole;
    }

    public void setAppUserRole(AppUserRole appUserRole) {
        this.appUserRole = appUserRole;
    }
}


