package com.azocar.cesar.searchonmysqlnodejs.Model;

public class Person {

    private int id;
    private String name, address, comuna, email, phone;

    public Person() {
    }

    public Person(int id, String name, String address, String comuna, String email, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.comuna = comuna;
        this.email = email;
        this.phone = phone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
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
}
