package hu.vid033AtComponentAtServiceAtRepositoryAtController.animalClasses;

import hu.vid033AtComponentAtServiceAtRepositoryAtController.bottomLayer.AnimalJdbcConnection;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("fish")
public class FishDAO implements AnimalJdbcConnection {

    @Override
    public String wantToEat() {
        return "The fish didn't want to eat anything.";
    }
}
