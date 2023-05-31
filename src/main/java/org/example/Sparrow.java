package org.example;

public class Sparrow extends Bird implements FlyingBird {
    FlyingBehaviour flyingBehaviour;

    public Sparrow(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    @Override
    public void fly() {

    }
}
