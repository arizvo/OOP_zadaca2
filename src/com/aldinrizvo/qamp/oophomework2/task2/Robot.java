package com.aldinrizvo.qamp.oophomework2.task2;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private final Point initialPosition;
    private final Point currentPosition;
    private final List<Point> moveTracker;

    public Robot() {
        this(0, 0);
    }

    public Robot(final int xCoordinate, final int yCoordinate) {
        this.initialPosition = new Point(xCoordinate, yCoordinate);
        this.currentPosition = new Point(xCoordinate, yCoordinate);
        this.moveTracker = new ArrayList<>();
    }

    public void moveSouth() {
        currentPosition.setYCoordinate(currentPosition.getYCoordinate() - 1);
        moveTracker.add(new Point(currentPosition.getXCoordinate(), currentPosition.getYCoordinate()));
    }

    public void moveNorth() {
        currentPosition.setYCoordinate(currentPosition.getYCoordinate() + 1);
        moveTracker.add(new Point(currentPosition.getXCoordinate(), currentPosition.getYCoordinate()));
    }

    public void moveEast() {
        currentPosition.setXCoordinate(currentPosition.getXCoordinate() + 1);
        moveTracker.add(new Point(currentPosition.getXCoordinate(), currentPosition.getYCoordinate()));
    }

    public void moveWest() {
        currentPosition.setXCoordinate(currentPosition.getXCoordinate() - 1);
        moveTracker.add(new Point(currentPosition.getXCoordinate(), currentPosition.getYCoordinate()));
    }

    public Point getPosition() {
        return currentPosition;
    }

    public double getDistance() {
        return initialPosition.getDistance(currentPosition);
    }

    public int getMoves() {
        return moveTracker.size();
    }

    public void printLastPosition(int n) {
        if (n > this.moveTracker.size()) {
            n = this.moveTracker.size();
        }

        for (int i = this.moveTracker.size() - 1; i >= this.moveTracker.size() - n; i--) {
            System.out.println(this.moveTracker.get(i));
        }
    }
}
