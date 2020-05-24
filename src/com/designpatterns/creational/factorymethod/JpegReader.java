package com.designpatterns.creational.factorymethod;

public class JpegReader implements ImageReader {
    private DecodeImage decodeImage;

    public JpegReader(String image) {
        this.decodeImage = new DecodeImage(image);
    }

    @Override
    public DecodeImage getDecodedImage() {
        return decodeImage;
    }
}
