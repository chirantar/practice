package org.example.design.patterns.creational.factory.media.player;

public class Program {
    public static void main(String[] args) {
        PlayerFactory playerFactory = new AudioPlayerFactory();
        MediaPlayer audioPlayer = playerFactory.getMediaPlayer("some-file");

        PlayerFactory playerFactory1 = new VideoPlayerFactory();
        MediaPlayer videoPlayer = playerFactory1.getMediaPlayer("som-file");

        videoPlayer.play();
        ((VideoPlayer) videoPlayer).forward();
    }
}
