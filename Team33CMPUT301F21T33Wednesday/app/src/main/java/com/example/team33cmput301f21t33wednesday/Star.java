package com.example.team33cmput301f21t33wednesday;

public class Star extends Shape {
    private int numPoints;
    private int pointAngle;

    public Star(int x, int y, String colour, int numPoints, int pointAngle) {
        super(x,y,colour);
        this.numPoints = numPoints;
        this.pointAngle = pointAngle;
    }
}