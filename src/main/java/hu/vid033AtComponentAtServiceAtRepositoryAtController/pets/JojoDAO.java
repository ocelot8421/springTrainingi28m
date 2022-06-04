package hu.vid033AtComponentAtServiceAtRepositoryAtController.pets;

import hu.vid033AtComponentAtServiceAtRepositoryAtController.bottomLayer.AnimalJdbcConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class JojoDAO {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("fish")
    private AnimalJdbcConnection animal;

    public String hungry() {

        String myPetIdea = animal.wantToEat();
        return myPetIdea;
    }

//    @PreDestroy
//    public void preDestroy(){
//        logger.info("Cshá preDestroy");
//    }
}