package com.designpatterns.structural.composite.filestructure;

public class CompositeDemo {
    public static StringBuffer compositeBuilder = new StringBuffer();

    public static void main(String[] args) {
        File track1 = new File("Don't wary, be happy.mp3");
        File track2 = new File("track2.m3u");
        File track3 = new File("Wind of change.mp3");
        File track4 = new File("Big city night.mp3");
        File track5 = new File("Rainbow in the dark.mp3");

        Directory music = new Directory("MUSIC");
        music.add(track1);

        Directory scorpions = new Directory("SCORPIONS");
        music.add(scorpions);
        music.add(track2);
        scorpions.add(track3);
        scorpions.add(track4);

        Directory dio = new Directory("DIO");
        scorpions.add(dio);
        dio.add(track5);

        music.ls();
    }
}
