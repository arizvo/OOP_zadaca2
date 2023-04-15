package com.aldinrizvo.qamp.oophomework2.task2;

public class Point {
    private int xCoordinate;
    private int yCoordinate;

    public Point() {
        this(0, 0);
    }

    public Point(final int xValue, final int yValue) {
        this.xCoordinate = xValue;
        this.yCoordinate = yValue;
    }

    public int getXCoordinate() {
        return this.xCoordinate;
    }

    public void setXCoordinate(final int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(final int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double getDistance(final Point point) {
        int deltaX = this.xCoordinate - point.getXCoordinate();
        int deltaY = this.yCoordinate - point.getYCoordinate();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public static double getDistance(final Point p1, final Point p2) {
        int deltaX = p1.getXCoordinate() - p2.getXCoordinate();
        int deltaY = p1.getYCoordinate() - p2.getYCoordinate();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    @Override
    public String toString() {
        return "(" + this.xCoordinate + "," + this.yCoordinate + ")";
    }
}
