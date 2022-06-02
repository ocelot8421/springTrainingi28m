package hu.a02Animals.animalClasses;

import hu.a02Animals.bottomLayer.Animal;
import org.springframework.stereotype.Component;


@Component

public class Hamster implements Animal {

    @Override
    public String wantToEat() {
        return "The hamster want to eat your nail";
    }
}
