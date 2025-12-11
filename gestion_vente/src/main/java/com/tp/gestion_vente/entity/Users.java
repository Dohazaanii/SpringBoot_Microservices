package com.tp.gestion_vente.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codeUser;
    @Column(length = 20)
    private String login;
    @Column(length = 20)
    private String pass;


    public Users(String login, String pass) {
        super();
        this.login = login;
        this.pass = pass;
    }
    public Users() {
        super();
    }
    public Users(Long codeUser, String login, String pass) {
        super();
        this.codeUser = codeUser;
        this.login = login;
        this.pass = pass;
    }
    public Long getCodeUser() {
        return codeUser;
    }
    public void setCodeUser(Long codeUser) {
        this.codeUser = codeUser;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }


}
