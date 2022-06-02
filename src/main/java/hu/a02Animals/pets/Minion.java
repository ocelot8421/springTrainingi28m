package hu.a02Animals.pets;

import hu.a02Animals.bottomLayer.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Minion {

    @Autowired
    @Qualifier("fish")
    private Animal animal;





    public String hungry(){

        String mePetIdea = animal.wantToEat();
        return mePetIdea;
    }




}