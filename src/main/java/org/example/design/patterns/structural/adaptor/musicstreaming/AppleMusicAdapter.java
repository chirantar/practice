package org.example.design.patterns.structural.adaptor.musicstreaming;

public class AppleMusicAdapter implements SpotifyStreaming{
    private final AppleMusicService appleMusicService;

    public AppleMusicAdapter(AppleMusicService appleMusicService){
        this.appleMusicService = appleMusicService;
    }
    @Override
    public void fetchMusicFromSpotify() {
        appleMusicService.fetchFromAppleMusic();
    }

    @Override
    public void playMusicFromSpotify() {
        appleMusicService.playFromAppleMusic();
    }
}
