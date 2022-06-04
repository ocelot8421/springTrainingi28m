package hu.vid033AtComponentAtServiceAtRepositoryAtController.animalClasses;

import hu.vid033AtComponentAtServiceAtRepositoryAtController.bottomLayer.AnimalJdbcConnection;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("monkey")
public class MonkeyDAO implements AnimalJdbcConnection {

    @Override
    public String wantToEat() {
        return "The monkey want to eat a banana";
    }
}
