package com.company;

import com.company.external.ImageViewer;

public class ImageAdaptor implements Player{

    private ImageViewer imageViewer;
    public ImageAdaptor(ImageViewer viewer){
        this.imageViewer=viewer;
    }


    @Override
    public void play(String filePath) {
        //call the ImageViewer -> show(filePath) method here

        //one way of doing this
        //ImageViewer imageViewer = new ImageViewer();

        imageViewer.show(filePath);
    }
}
