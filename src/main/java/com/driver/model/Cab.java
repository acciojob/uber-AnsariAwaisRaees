package com.driver.model;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Cab")
public
class Cab{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int perKM;

    boolean available;

    public Cab() {
    }

    @OneToOne
    @JoinColumn
    Driver driver;

    public Cab(int id, int perKM, boolean available) {
        this.id = id;
        this.perKM = perKM;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerKM() {
        return perKM;
    }

    public void setPerKM(int perKM) {
        this.perKM = perKM;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean getAvailable() {
        return available;
    }

    public int getPerKmRate() {
        return perKM;
    }
}