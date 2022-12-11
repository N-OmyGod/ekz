package com.example.ekz2.models;

public class LoginModel {
    public String email;
    public String password;
    public LoginModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

public String getEmail(){
    return email;
}
    public String getPassword() {
        return password;
    }

}
