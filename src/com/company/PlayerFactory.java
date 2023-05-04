package com.company;

public class PlayerFactory {

    //factory method
    public Player getInstance(String filePath) {

        Player player = null;

        if(filePath.endsWith(".mp3")){
            player = new MP3Player();

        }

        else if(filePath.endsWith(".mp4")) {
            player = new MP4Player();

        }

        return player;
    }
}
