package com.realestate.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "realestate")
public class Realestate {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;
    private String lastName;
    private String mail;
    private String mobileNumber;
    private String password;

    @Override
    public String toString() {
        return "Realestate [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mail=" + mail
                + ", mobileNumber=" + mobileNumber + ", password=" + password + "]";
    }

    public Realestate(Integer id, String firstName, String lastName, String mail, String mobileNumber,
            String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.mobileNumber = mobileNumber;
        this.password = password;
    }

    public Realestate() {
    }

   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

}
