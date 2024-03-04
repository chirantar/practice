package org.example.design.patterns.creational.factory.media.player;

public class VideoPlayerFactory extends PlayerFactory{
    @Override
    public MediaPlayer createMediaPlayer(String fileName) {
        return new VideoPlayer();
    }
}
