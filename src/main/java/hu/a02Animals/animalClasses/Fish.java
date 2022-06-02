package hu.a02Animals.animalClasses;

import hu.a02Animals.bottomLayer.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("fish")
public class Fish implements Animal {

    @Override
    public String wantToEat() {
        return "The fish didn't want to eat anything.";
    }
}
