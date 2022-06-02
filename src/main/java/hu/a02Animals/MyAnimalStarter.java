package hu.a02Animals;

import hu.a02Animals.animalClasses.Dog;
import hu.a02Animals.pets.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAnimalStarter {
    public static void main(String[] args) {

        //Tight Coupling
        Caesar ceasar = new Caesar();
        String ideaCeaser = ceasar.hungry();
        System.out.println(ideaCeaser);

        //Loose Coupling
        Hugo hugo = new Hugo(new Dog());
        String ideaHugo = hugo.hungry();
        System.out.println(ideaHugo);


        //Spring

        ConfigurableApplicationContext context =
                SpringApplication.run(MyAnimalStarter.class, args);

        Jojo jojo = context.getBean(Jojo.class);
        String ideaJojo = jojo.hungry();
        System.out.println(jojo);
        System.out.println(context.getBean(Jojo.class));
        System.out.println(ideaJojo + "   <<<<<<<<<<<<<<<<<<");

        Lemon lemon = context.getBean(Lemon.class);
        String ideaLemon = lemon.hungry();
        System.out.println(lemon);
        System.out.println(context.getBean(Lemon.class));
        System.out.println(ideaLemon + "    <<<<<<<<<<<<<<<<<<<");

        Minion minion = context.getBean(Minion.class);
        String ideaMinion = minion.hungry();
        System.out.println(minion);
        System.out.println(context.getBean(Minion.class));
        System.out.println(ideaMinion + "    <<<<<<<<<<<<<<<<<<<");

        Nudli nudli = context.getBean(Nudli.class);
        String ideaNudli = nudli.hungry();
        System.out.println(nudli);
        System.out.println(context.getBean(Nudli.class));
        System.out.println(ideaNudli + "      <<<<<<<<<<<<<<<<<<");
    }
}
