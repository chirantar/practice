package org.example.lld.parkinglot;

public class FeeCalculator {
    public double calculateFee(Vehicle vehicle){
        int totalTime = vehicle.exitTime.getHour() - vehicle.entryTime.getHour();
        int totalDays = (int)Math.ceil(totalTime*1.0/24);
        return vehicle.getPrice() *totalDays;
    }
}
