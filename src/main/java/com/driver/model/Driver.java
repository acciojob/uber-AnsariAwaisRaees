package com.driver.model;

import jdk.jfr.DataAmount;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PACKAGE)
@Entity
@Table(name = "Driver")
public class Driver{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int driverID;

    String driverMobileNo;

    String password;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    List<TripBooking> tripBookingList = new ArrayList<>();

    @OneToOne(mappedBy = "driver", cascade = CascadeType.ALL)
    Cab cab;

    public Driver() {
    }

    public Driver(int driverID, String driverMobileNo, String password) {
        this.driverID = driverID;
        this.driverMobileNo = driverMobileNo;
        this.password = password;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public String getDriverMobileNo() {
        return driverMobileNo;
    }

    public void setDriverMobileNo(String driverMobileNo) {
        this.driverMobileNo = driverMobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }
}