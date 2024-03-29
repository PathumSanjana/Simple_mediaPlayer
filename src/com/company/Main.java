package com.company;

public class Main {

    public static void main(String[] args) {

        String filePath = args[0];

        //if the fileName ends with .mp3 call MP3Player ->play() method
        //if the fileName ends with .mp4 call MP4Player ->play() method
       /*
       if(filePath.endsWith(".mp3")){
            MP3Player mp3Player = new MP3Player();
            mp3Player.play(filePath);
        }

        else if(filePath.endsWith(".mp4")) {
            MP4Player mp4Player = new MP4Player();
            mp4Player.play(filePath);
        } */

        //using the factory method design pattern to initialize the player object
        PlayerFactory factory = new PlayerFactory();
        Player player = factory.getInstance(filePath);
        if(player != null) {
            player.play(filePath);
        }
        else{
            System.out.println("The file format is not supported");
        }


    }
}


//let's assume that we are going to create an application which can be used to play audio/video files
// MP3 files, MP4 files, MKV files etc will be supported.
//after a while you get a requirement to display image files in this player.
//and you saw that there is a library written by someone else which can be used to display images.