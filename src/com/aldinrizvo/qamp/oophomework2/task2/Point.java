package com.aldinrizvo.qamp.oophomework2.task2;

public class Point {
    private double xCoordinate;
    private double yCoordinate;

    public Point() {
        this(0, 0);
    }

    public Point(final double xValue, final double yValue) {
        this.xCoordinate = xValue;
        this.yCoordinate = yValue;
    }

    public double getXCoordinate() {
        return this.xCoordinate;
    }

    public void setXCoordinate(final double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(final double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    @Override
    public String toString() {
        return "(" + this.xCoordinate + ", " + this.yCoordinate + ")";
    }
}
