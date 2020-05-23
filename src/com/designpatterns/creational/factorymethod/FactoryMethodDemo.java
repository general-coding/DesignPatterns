package com.designpatterns.creational.factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        DecodeImage decodeImage;
        ImageReader imageReader;

        String image = args[0];
        String format = image.substring(image.indexOf('.') + 1);

        switch (format) {
            case "gif":
                imageReader = new GifReader(image);
                break;

            case "jpeg":
                imageReader = new JpegReader(image);
                break;

            default:
                imageReader = null;
        }

        if (imageReader != null) {
            decodeImage = imageReader.getDecodedImage();
            System.out.println(decodeImage);
        }
    }
}
