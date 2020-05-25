package com.designpatterns.creational.factorymethod;

public class DecodeImage {
    private final String image;

    public DecodeImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return image + ": is decoded";
    }
}
