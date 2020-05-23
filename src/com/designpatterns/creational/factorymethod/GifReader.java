package com.designpatterns.creational.factorymethod;

public class GifReader implements ImageReader{
    private DecodeImage decodeImage;

    @Override
    public DecodeImage getDecodedImage() {
        return decodeImage;
    }

    public GifReader(String image){
        this.decodeImage = new DecodeImage(image);
    }
}
