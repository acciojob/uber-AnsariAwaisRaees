package com.driver.model;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "TripBooking")
public class TripBooking{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int tripBookingID;

    String fromLocation;

    String toLocation;

    int distanceInKM;

    TripStatus tripStatus;

    int bill;

    @ManyToOne
    @JoinColumn
    Customer customer;

    @ManyToOne
    @JoinColumn
    Driver driver;

    public TripBooking() {
    }

    public TripBooking(int tripBookingID, String fromLocation, String toLocation, int distanceInKM, TripStatus tripStatus, int bill) {
        this.tripBookingID = tripBookingID;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKM = distanceInKM;
        this.tripStatus = tripStatus;
        this.bill = bill;
    }

    public int getTripBookingID() {
        return tripBookingID;
    }

    public void setTripBookingID(int tripBookingID) {
        this.tripBookingID = tripBookingID;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public int getDistanceInKM() {
        return distanceInKM;
    }

    public void setDistanceInKM(int distanceInKM) {
        this.distanceInKM = distanceInKM;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKM = distanceInKm;
    }
}