package org.example;

public class Crow extends Bird implements FlyingBird {
    FlyingBehaviour flyingBehaviour;

    Crow(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }
    @Override
    public void fly() {
        flyingBehaviour.makeFly();
    }
}
