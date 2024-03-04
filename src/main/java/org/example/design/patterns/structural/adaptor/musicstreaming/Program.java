package org.example.design.patterns.structural.adaptor.musicstreaming;

public class Program {
    public static void main(String[] args) {
        SpotifyStreaming spotifyStreaming = new SpotifyService();
        playMusic(spotifyStreaming);

        AppleMusicService appleMusicService = new AppleMusicService();
        SpotifyStreaming appleMusicAdapter = new AppleMusicAdapter(appleMusicService);
        appleMusicAdapter.fetchMusicFromSpotify();
        appleMusicAdapter.playMusicFromSpotify();
    }

    private static void playMusic(SpotifyStreaming spotifyStreaming) {
        spotifyStreaming.fetchMusicFromSpotify();
        spotifyStreaming.playMusicFromSpotify();
    }
}
