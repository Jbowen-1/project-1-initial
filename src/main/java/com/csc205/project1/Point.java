package com.csc205.project1;

// AI Prompt: Design and implement the Point class to represent
// a point in the Cartesian plane. To do this, include a constructor
// that takes x and y values as double arguments, standard setters/getters,
// setPoint(double x, double y), shiftX and shiftY
// add a distance(Point p2) to find the distance to point p2 and a
// rotate(double angle) to rotate the point by an angle around the
// origin in radians
public class Point {

    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Standard setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Standard getters
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // Set the coordinates of the point
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Shift the point by a given amount along the x-axis
    public void shiftX(double n) {
        this.x += n;
    }

    // Shift the point by a given amount along the y-axis
    public void shiftY(double n) {
        this.y += n;
    }

    // Calculate the distance to another point
    public double distance(Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - this.x, 2) + Math.pow(p2.getY() - this.y, 2));
    }

    // Rotate the point by a specified angle around the origin
    public void rotate(double angle) {
        double newX = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        double newY = this.x * Math.sin(angle) + this.y * Math.cos(angle);
        this.x = Math.round(newX * 1e10) / 1e10;
        this.y = Math.round(newY * 1e10) / 1e10;
    }

    @Override
    public String toString() {
        return "Point(" + this.x + ", " + this.y + ")";
    }

    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        System.out.println("Distance between p1 and p2: " + p1.distance(p2));

        p1.rotate(Math.PI / 2);
        System.out.println("Point 1 after rotation: " + p1);
    }
}
