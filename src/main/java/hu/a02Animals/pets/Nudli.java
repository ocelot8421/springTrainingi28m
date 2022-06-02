package hu.a02Animals.pets;

import hu.a02Animals.bottomLayer.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Nudli {

    @Autowired
    private Animal hamster;

    public String hungry() {

        String myPetIdea = hamster.wantToEat();
        return myPetIdea;
    }

}
