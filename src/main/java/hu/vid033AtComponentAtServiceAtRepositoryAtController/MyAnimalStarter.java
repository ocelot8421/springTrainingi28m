package hu.vid033AtComponentAtServiceAtRepositoryAtController;

import hu.vid033AtComponentAtServiceAtRepositoryAtController.animalClasses.HamsterDAO;
import hu.vid033AtComponentAtServiceAtRepositoryAtController.pets.JojoDAO;
import hu.vid033AtComponentAtServiceAtRepositoryAtController.pets.NoodleDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyAnimalStarter {
    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(MyAnimalStarter.class, args);

        NoodleDAO noodleDAO = context.getBean(NoodleDAO.class);
        System.out.println(noodleDAO.hungry());

        JojoDAO jojoDAO = context.getBean(JojoDAO.class);
        System.out.println(jojoDAO.hungry());

        HamsterDAO hamsterDAO = context.getBean(HamsterDAO.class);
        System.out.println(hamsterDAO.wantToEat());
    }
}
