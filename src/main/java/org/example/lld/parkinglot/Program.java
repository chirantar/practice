package org.example.lld.parkinglot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(new FeeCalculator());
        ParkingFloor parkingFloor1 = new ParkingFloor();
//        parkingFloor1.setFloorNum("floor1");
//        parkingFloor1.setFloorNum(1);
        Slot slot = new Slot();
        slot.setId("id1");
        Slot slot2 = new Slot();
        slot.setId("id1");
        parkingFloor1.setSlots(Arrays.asList(slot2, slot));


    }
}
