package org.example.lld.kafka;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Topic {
    private String name;
    List<Partition> partitions;

    public Topic(String name, int numPartitions){
        this.name = name;
        this.partitions = new ArrayList<>(numPartitions);
        for(int i = 0; i < numPartitions; i++){
            partitions.add(new Partition());
        }
    }
}
