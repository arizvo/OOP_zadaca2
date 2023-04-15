package com.aldinrizvo.qamp.oophomework2.task2;

public class MainRobot {
    public static void main(String[] args) {
        System.out.println("Initial robot implementation: \n");
        Robot optimusPrime = new Robot(); // 0, 0
        int n = 16;

        optimusPrime.moveSouth(); // 0, -1
        optimusPrime.moveEast(); // 1, -1
        optimusPrime.moveEast(); // 2, -1
        optimusPrime.moveWest(); // 1, -1
        optimusPrime.moveSouth(); // 1, -2
        optimusPrime.moveNorth(); // 1, -1
        optimusPrime.moveEast(); // 2, -1

        System.out.println("Current position of the robot is: " + optimusPrime.getPosition());
        System.out.println("Distance from initial point is: " + optimusPrime.getDistance());
        System.out.println("Total number of moves is: " + optimusPrime.getMoves());

        if (n > optimusPrime.getMoves()) {
            n = optimusPrime.getMoves();
        }

        System.out.println("\nLast " + n + " moves: ");
        optimusPrime.printLastPosition(n);

        System.out.println("\nRobot implementation using only a list of positions: \n");
        RobotListOnly et = new RobotListOnly(); // 0, 0

        et.moveSouth(); // 0, -1
        et.moveEast(); // 1, -1
        et.moveEast(); // 2, -1
        et.moveWest(); // 1, -1
        et.moveSouth(); // 1, -2
        et.moveNorth(); // 1, -1
        et.moveEast(); // 2, -1

        System.out.println("Current position of the robot is: " + et.getPosition());
        System.out.println("Distance from initial point is: " + et.getDistance());
        System.out.println("Total number of moves is: " + et.getMoves());

        if (n > et.getMoves()) {
            n = et.getMoves();
        }

        System.out.println("\nLast " + n + " moves: ");
        et.printLastPosition(n);
    }
}
