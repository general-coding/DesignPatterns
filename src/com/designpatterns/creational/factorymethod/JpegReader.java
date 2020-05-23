package com.designpatterns.creational.factorymethod;

public class JpegReader implements ImageReader {
    private DecodeImage decodeImage;

    @Override
    public DecodeImage getDecodedImage() {
        return decodeImage;
    }

    public JpegReader(String image) {
        this.decodeImage = new DecodeImage(image);
    }
}
