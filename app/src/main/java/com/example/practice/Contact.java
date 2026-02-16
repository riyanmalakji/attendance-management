package com.example.practice;

public class Contact {
    private String name;
    private String email;
    private String phone;
    private String classStr;
    private String rollNumber;

    public Contact() {
        // Default constructor required for Firebase
    }

    public Contact(String name, String email, String phone, String classStr, String rollNumber) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.classStr = classStr;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClassStr() {
        return classStr;
    }

    public void setClassStr(String classStr) {
        this.classStr = classStr;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
