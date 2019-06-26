package com.example.demo.entity;

public class User {

    private int id;
    private String user_name;
    private String company_address;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }






    @Override
    public String toString() {
        return "User [id=" + id + ", user_name=" + user_name + ", company_address=" + company_address + "]";
    }



}
