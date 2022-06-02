package hu.a05PostConstructAndPReDestroy.animalClasses;

import hu.a05PostConstructAndPReDestroy.bottomLayer.Animal;
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
