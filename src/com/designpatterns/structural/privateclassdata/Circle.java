package com.designpatterns.structural.privateclassdata;

import java.awt.*;

public class Circle {
    private CircleData circleData;

    public Circle(double radius, Color color, Point origin) {
        this.circleData = new CircleData(radius, color, origin);
    }

    public double getCircumference() {
        return this.circleData.getRadius() * Math.PI;
    }

    public double getDiameter() {
        return this.circleData.getRadius() * 2;
    }

    public void Draw(Graphics graphics) {
        //...
    }
}
