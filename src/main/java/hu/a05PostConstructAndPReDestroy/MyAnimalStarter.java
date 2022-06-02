package hu.a05PostConstructAndPReDestroy;

import hu.a05PostConstructAndPReDestroy.animalClasses.Hamster;
import hu.a05PostConstructAndPReDestroy.pets.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyAnimalStarter {
    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(MyAnimalStarter.class, args);

        NudliDog nudliDog = context.getBean(NudliDog.class);
        System.out.println(nudliDog.hungry());

        Jojo jojo = context.getBean(Jojo.class);
        System.out.println(jojo.hungry());

        Hamster hamster = context.getBean(Hamster.class);
        System.out.println(hamster.wantToEat());
    }
}
