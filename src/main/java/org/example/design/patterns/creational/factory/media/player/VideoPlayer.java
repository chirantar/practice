package org.example.design.patterns.creational.factory.media.player;

public class VideoPlayer implements MediaPlayer{
    @Override
    public String getFileName() {
        return null;
    }

    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

    public void rewind(){
        System.out.println("rewind");
    }

    public void forward(){
        System.out.println("forward");
    }
}
