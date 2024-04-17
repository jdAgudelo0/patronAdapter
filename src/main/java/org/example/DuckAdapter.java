package org.example;

// Adapter class that adapts a Duck to behave like a Robot
public class DuckAdapter implements Robot{
    // Reference to the Duck object being adapted
    private Duck duck;

    // Constructor that takes a Duck object to be adapted
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }
    // Implementation of the move method, delegates to the Duck's fly method
    @Override
    public void move() {
        duck.fly();
    }
    // Implementation of the speak method, delegates to the Duck's squawk method
    @Override
    public void speak() {
        duck.squawk();
    }
}
