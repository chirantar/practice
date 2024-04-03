package org.example.lld.parkinglot;

import lombok.Getter;
import lombok.Setter;
import org.example.lld.parkinglot.enums.SlotStatus;

@Getter
@Setter
public class Slot {
    String id;
    SlotStatus status = SlotStatus.VACANT;
    String vehicleId = null;
}
