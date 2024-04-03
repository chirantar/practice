package org.example.lld.parkinglot;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingFloor {
    private String id;
    private String floorNum;
    private List<Slot> slots;
}
