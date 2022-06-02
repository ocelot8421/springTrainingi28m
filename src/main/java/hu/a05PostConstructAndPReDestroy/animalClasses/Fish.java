package hu.a05PostConstructAndPReDestroy.animalClasses;

import hu.a05PostConstructAndPReDestroy.bottomLayer.Animal;
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
