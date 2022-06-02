package hu.a05PostConstructAndPReDestroy.animalClasses;

import hu.a05PostConstructAndPReDestroy.bottomLayer.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;


@Component
@Qualifier("hamster")
public class Hamster implements Animal {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String wantToEat() {
        return "The hamster want to eat your nail";
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("Cshá preDestroy");
    }
}
