package org.example;

//main class
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create a MallardDuck and a GiantRobot
        MallardDuck mallardDuck = new MallardDuck();
        GiantRobot giantRobot = new GiantRobot();

        //We adapt the duck to behave like a robot
        Robot adaptedDuck= new DuckAdapter(mallardDuck);

        // Test the behavior of the GiantRobot
        System.out.println("the Robot is speaking:");
        giantRobot.move();
        giantRobot.speak();

        // Test the behavior of the MallardDuck
        System.out.println("\nthe Duck is acting:");
        mallardDuck.fly();
        mallardDuck.squawk();

        // Test the behavior of the adapted Duck
        System.out.println("\nThe Adapted duck is acting like Robot");
        adaptedDuck.move();
        adaptedDuck.speak();
    }
}