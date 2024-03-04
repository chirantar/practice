package org.example.design.patterns.creational.factory.media.player;

public interface MediaPlayer {
    String getFileName();
    void play();
    void pause();
    void stop();
    void volumeUp();
    void volumeDown();

    default void setFileName(String filename) {

    }
}
