package org.example.design.patterns.creational.factory.media.player;

public abstract class PlayerFactory {
    public MediaPlayer getMediaPlayer(String fileName){
        return createMediaPlayer(fileName);
    }

    public abstract MediaPlayer createMediaPlayer(String fileName);
}
