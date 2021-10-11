/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author nttth
 */
public class Customer {
    private int id;
    private String username;
    private String password;
    private int authority;
    private String fullName;
    private String address;
    private String phone;
    
    public Customer() {
    }

    public Customer(int id, String fullName, String address, String phone) {// for infor table
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
    }

    public Customer(int id, String username, String password, int authority) { // for user table
        this.id = id;
        this.username = username;
        this.password = password;
        this.authority = authority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }


    
}
