package com.example.bank;

public class Admin {
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean Authenticate(String username,String password)
    {
        return true;
    }
    public void resolveTransactions()
    {

    }
    public void resolveTransfers()
    {

    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
