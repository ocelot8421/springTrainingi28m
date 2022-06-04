package hu.vid033AtComponentAtServiceAtRepositoryAtController.animalClasses;

import hu.vid033AtComponentAtServiceAtRepositoryAtController.bottomLayer.AnimalJdbcConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("hamster")
public class HamsterDAO implements AnimalJdbcConnection {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String wantToEat() {
        return "The hamster want to eat your nail";
    }

//    @PreDestroy
//    public void preDestroy(){
//        logger.info("Cshá preDestroy");
//    }
}
