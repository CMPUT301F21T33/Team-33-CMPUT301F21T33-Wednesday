package com.example.team33cmput301f21t33wednesday;

public abstract class Shape {
    private int x;
    private int y;
    private String colour = "$PUT_YOUR_CHOICE_OF_COLOR";

    public Shape(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.colour = colour;
    }
}
