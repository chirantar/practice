package org.example.lld.parkinglot;

import org.example.lld.parkinglot.enums.VehicleType;

import java.time.LocalDateTime;

public abstract class Vehicle {
    String id;
    String vehicleNum;
    LocalDateTime entryTime;
    LocalDateTime exitTime;

    //Parking Ticket

    public abstract double getPrice();
}
