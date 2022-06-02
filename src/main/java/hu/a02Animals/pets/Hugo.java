package hu.a02Animals.pets;

import hu.a02Animals.bottomLayer.Animal;




public class Hugo {


    private Animal animal;

    public Hugo(Animal animal) {
        this.animal = animal;
    }

    public String hungry(){

        String myPetIdea = animal.wantToEat();
        return myPetIdea;
    }




}