package com.aldinrizvo.qamp.oophomework2.task2;

public class MainRobot {
    public static void main(String[] args) {
        Robot optimusPrime = new Robot(); // 0, 0
        int n = 4;

        optimusPrime.moveSouth(); // 0, -1
        optimusPrime.moveEast(); // 1, -1
        optimusPrime.moveEast(); // 2, -1
        optimusPrime.moveWest(); // 1, -1
        optimusPrime.moveSouth(); // 1, -2
        optimusPrime.moveNorth(); // 1, -1
        optimusPrime.moveEast(); // 2, -1

        System.out.println("Current possition of the robot is: " + optimusPrime.getPosition());
        System.out.println("Distance from initial point is: " + optimusPrime.getDistance());
        System.out.println("Total number of moves is: " + optimusPrime.getMoves());

        System.out.println("\nLast " + n + " moves: ");
        optimusPrime.printLastPosition(n);
    }
}
