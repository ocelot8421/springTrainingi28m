package hu.a05PostConstructAndPReDestroy.pets;

import hu.a05PostConstructAndPReDestroy.bottomLayer.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class NudliDog {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("monkey")
    private Animal animal;

    public String hungry() {
        String myPetIdea = animal.wantToEat();
        return myPetIdea;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("Szia postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("Szevasz preDestroy");
    }
}
