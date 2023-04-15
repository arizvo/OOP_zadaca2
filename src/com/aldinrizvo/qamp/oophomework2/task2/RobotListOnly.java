package com.aldinrizvo.qamp.oophomework2.task2;

import java.util.ArrayList;
import java.util.List;

public class RobotListOnly {
    private final List<Point> moveTracker;

    public RobotListOnly() {
        this(0, 0);
    }

    public RobotListOnly(final int xCoordinate, final int yCoordinate) {
        this.moveTracker = new ArrayList<>();
        moveTracker.add(new Point(xCoordinate, yCoordinate));
    }

    public void moveSouth() {
        moveTracker.add(new Point(getPosition().getXCoordinate(), getPosition().getYCoordinate() - 1));
    }

    public void moveNorth() {
        moveTracker.add(new Point(getPosition().getXCoordinate(), getPosition().getYCoordinate() + 1));
    }

    public void moveEast() {
        moveTracker.add(new Point(getPosition().getXCoordinate() + 1, getPosition().getYCoordinate()));
    }

    public void moveWest() {
        moveTracker.add(new Point(getPosition().getXCoordinate() - 1, getPosition().getYCoordinate()));
    }

    public Point getInitialPosition() {
        return moveTracker.get(0);
    }

    public Point getPosition() {
        return moveTracker.get(moveTracker.size() - 1);
    }

    public double getDistance() {
        return Point.getDistance(getInitialPosition(), getPosition());
    }

    public int getMoves() {
        return moveTracker.size() - 1;
    }

    public void printLastPosition(int n) {
        if (n > this.moveTracker.size() - 1) {
            n = this.moveTracker.size() - 1;
        }

        for (int i = this.moveTracker.size() - 1; i >= this.moveTracker.size() - n; i--) {
            System.out.println(this.moveTracker.get(i));
        }
    }
}
