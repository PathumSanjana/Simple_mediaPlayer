package com.company;

import com.company.external.ImageViewer;

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

        else if(filePath.endsWith(".mkv")) {
            player = new MKVPlayer();

        }

        else if(filePath.endsWith(".jpg")) {
           // player = new ImageViewer(); //this error comes because the ImageViewer class is incompatible with Player interface.
            //to sort out this problem we can use Adaptor class

            player = new ImageAdaptor(new ImageViewer());
        }

        return player;
    }
}
