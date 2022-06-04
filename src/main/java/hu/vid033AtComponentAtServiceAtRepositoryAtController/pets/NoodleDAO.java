package hu.vid033AtComponentAtServiceAtRepositoryAtController.pets;

import hu.vid033AtComponentAtServiceAtRepositoryAtController.bottomLayer.AnimalJdbcConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NoodleDAO {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("monkey")
    private AnimalJdbcConnection animal;

    public String hungry() {
        String myPetIdea = animal.wantToEat();
        return myPetIdea;
    }

//    @PostConstruct
//    public void postConstruct(){
//        logger.info("Szia postConstruct");
//    }
//
//    @PreDestroy
//    public void preDestroy(){
//        logger.info("Szevasz preDestroy");
//    }
}
