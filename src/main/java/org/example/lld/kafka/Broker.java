package org.example.lld.kafka;

import java.util.List;

public class Broker {
    private List<Topic> topics;

    public void createTopic(String topicName, int numPartitions){
        for (Topic existingTopic : topics) {
            if (existingTopic.getName().equalsIgnoreCase(topicName)){
                System.out.println("Topic already present" + topicName);
                return;
            }
        }

        Topic newTopic = new Topic(topicName, numPartitions);
        topics.add(newTopic);
    }

    public Topic getTopic(String topicName) {
        for (Topic topic : topics) {
            if (topic.getName().equals(topicName)) {
                return topic;
            }
        }
        return null;
    }
}
