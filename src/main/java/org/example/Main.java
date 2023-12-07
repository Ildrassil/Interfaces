package org.example;

public class Main {

    public static void main(String[] args) {
    Playable music = new MusicPlayer();
    Playable video = new VideoPlayer();



    MediaPlayer media = new MediaPlayer();

        media.playMedia(music);
        media.playMedia(video);



    }
}