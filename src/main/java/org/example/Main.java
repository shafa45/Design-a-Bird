package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird crow = new Crow(new CrowSparrowFlyingBehaviour());
        Bird sparrow = new Sparrow(new CrowSparrowFlyingBehaviour());
        Bird ostrich = new Penguin();
        List<Bird> birdList = List.of(crow, sparrow, ostrich);
    }
}