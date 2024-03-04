package org.example.design.patterns.creational.factory.media.player;

public class AudioPlayerFactory extends PlayerFactory{
    @Override
    public MediaPlayer createMediaPlayer(String fileName) {
        return new AudioPlayer();
    }
}
