package hu.vid034ExternalPorpertiesAtValueAtPropertySource;

import hu.vid034ExternalPorpertiesAtValueAtPropertySource.properties.AnimalExternalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class MyAnimalStarter {
    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(MyAnimalStarter.class, args);

        AnimalExternalService service = context.getBean(AnimalExternalService.class);
        System.out.println(service.returnServiceURL());

    }
}
