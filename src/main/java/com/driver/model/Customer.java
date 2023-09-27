package com.driver.model;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Customer")
public class Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerID;

    String customerMobileNo;

    String password;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    List<TripBooking> tripBookingList = new ArrayList<>();

    public Customer() {
    }

    public Customer(int customerID, String mobileNo, String password) {
        this.customerID = customerID;
        this.customerMobileNo = mobileNo;
        this.password = password;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getMobileNo() {
        return customerMobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.customerMobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }
}