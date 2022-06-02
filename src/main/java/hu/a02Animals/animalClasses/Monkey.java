package hu.a02Animals.animalClasses;

import hu.a02Animals.bottomLayer.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
@Qualifier("monkey")
public class Monkey implements Animal {

    @Override
    public String wantToEat() {
        return "The monkey want to eat a banana";
    }
}
