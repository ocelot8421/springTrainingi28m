package hu.a02Animals.animalClasses;

import hu.a02Animals.bottomLayer.Animal;





public class Cat implements Animal {

    @Override
    public String wantToEat() {
        return "The cat want to eat the fish.";
    }
}
