package org.example;

public class MallardDuck implements Duck{

    // Implementation of the squawk method for the Mallard Duck
    @Override
    public void squawk() {
        System.out.println("quack");
    }
    // Implementation of the fly method for the Mallard Duck
    public void fly(){
        System.out.println("i'm flying");
    }
}
