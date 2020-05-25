package com.designpatterns.structural.composite.filestructure;

// File implements the "lowest common denominator"
class File implements AbstractFile {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
    }
}