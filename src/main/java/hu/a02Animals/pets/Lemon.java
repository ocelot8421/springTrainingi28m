package hu.a02Animals.pets;

import hu.a02Animals.bottomLayer.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class Lemon {

    @Autowired
    private Animal fish;





    public String hungry() {

        String myPetIdea = fish.wantToEat();
        return myPetIdea;
    }

    public void setAnimal(Animal fish) {
        this.fish = fish;
    }

}