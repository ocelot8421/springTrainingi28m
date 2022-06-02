package hu.a02Animals.animalClasses;

import hu.a02Animals.bottomLayer.Animal;


public class Dog implements Animal {

    @Override
    public String wantToEat() {
        return "The dog want to eat the cat.";
    }
}
