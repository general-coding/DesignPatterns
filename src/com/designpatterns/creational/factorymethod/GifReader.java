package com.designpatterns.creational.factorymethod;

public class GifReader implements ImageReader {
    private final DecodeImage decodeImage;

    public GifReader(String image) {
        this.decodeImage = new DecodeImage(image);
    }

    @Override
    public DecodeImage getDecodedImage() {
        return decodeImage;
    }
}
