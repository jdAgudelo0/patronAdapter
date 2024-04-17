package org.example;

// Class representing a Giant Robot
public class GiantRobot implements Robot{

    // Implementation of the move method for the Giant Robot
    @Override
    public void move() {
        System.out.println("i'm walking");
    }
    // Implementation of the speak method for the Giant Robot
    @Override
    public void speak() {
        System.out.println("hi, i'm a robot");
    }
}
