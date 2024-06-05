package org.example.HW2.Task2;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {

    }

    public Rectangle setWidth(int width) {
        return new Rectangle(height, width);
    }

    public Rectangle setHeight(int height) {
        return new Rectangle(height, width);
    }

    public double area() {
        return width * height;
    }
}
