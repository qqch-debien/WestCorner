package com.example.westcornerback.model;

public class User {
    private String pseudo;
    private String email;
    private String pwd;
    private String[] ordersIds;
    
    public User(String pseudo, String email, String pwd, String[] ordersIds) {
        this.pseudo = pseudo;
        this.email = email;
        this.pwd = pwd;
        this.ordersIds = ordersIds;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String[] getOrdersIds() {
        return ordersIds;
    }

    public void setOrdersIds(String[] ordersIds) {
        this.ordersIds = ordersIds;
    }

    
}
