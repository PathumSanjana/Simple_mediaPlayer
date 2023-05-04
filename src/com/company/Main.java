package com.company;

public class Main {

    public static void main(String[] args) {

        MP3Player mp3Player = new MP3Player();
        mp3Player.play("C://songs/test.mp3");

        MP4Player mp4Player = new MP4Player();
        mp4Player.play("C://movies/test.mp4");

    }
}


//let's assume that we are going to create an application which can be used to play audio/video files
// MP3 files, MP4 files, MKV files etc will be supported.