package hu.a02Animals.pets;

import hu.a02Animals.bottomLayer.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Jojo {

    @Autowired
    private Animal monkey;

    public Jojo(Animal monkey) {
        this.monkey = monkey;
    }

    public String hungry() {

        String myPetIdea = monkey.wantToEat();
        return myPetIdea;
    }




}