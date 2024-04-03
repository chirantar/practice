package org.example.lld.parkinglot;

import org.example.lld.parkinglot.enums.SlotStatus;

import java.util.List;
import java.util.Optional;

public class ParkingSystem {
    private final FeeCalculator feeCalculator;
    public ParkingSystem(FeeCalculator feeCalculator){
        this.feeCalculator = feeCalculator;
    }
    List<ParkingFloor> parkingFloors;
    public Slot getAvailableSlot(Vehicle vehicle){
        Optional<Slot> slot = parkingFloors.stream()
                .flatMap(floor-> floor.getSlots().stream())
                .filter(x->x.getStatus() == SlotStatus.VACANT).findFirst();

        return slot.orElse(null);
    }

    public boolean vacantSlot(Vehicle vehicle){
        Optional<Slot> slot = parkingFloors.stream()
                .flatMap(floor-> floor.getSlots().stream()).filter(x->x.getVehicleId() == vehicle.id).findFirst();
        slot.get().setStatus(SlotStatus.VACANT);
        return true;
    }

    public Invoice getInvoice(Vehicle vehicle){
        double amt = feeCalculator.calculateFee(vehicle);
        return null;
    }
}
