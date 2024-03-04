package org.example.design.patterns.creational.factory.media.player;

public class AudioPlayer implements MediaPlayer{

    private String filename;

    @Override
    public String getFileName() {
        return filename;
    }

    @Override
    public void play() {

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

    @Override
    public void setFileName(String filename){
        this.filename = filename;
    }
}
