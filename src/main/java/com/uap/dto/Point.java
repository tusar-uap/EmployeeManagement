package com.uap.dto;

public class Point {
      private double width;
      private double height;

    public Point() {
    }

    public Point(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Point{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
