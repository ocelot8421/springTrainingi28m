package hu.a03SingeltonPrototypeProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyAntiqueStarter {

    private static Logger LOGGER = LoggerFactory.getLogger(MyAntiqueStarter.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(MyAntiqueStarter.class, args);

        AntiqueDAO antiqueDAO = context.getBean(AntiqueDAO.class);
        AntiqueDAO antiqueDAO2 = context.getBean(AntiqueDAO.class);

        LOGGER.info("{}", antiqueDAO);
        LOGGER.info("{}", antiqueDAO.getAntique());

        LOGGER.info("{}", antiqueDAO2);
        LOGGER.info("{}", antiqueDAO2.getAntique());


        ByzantineDAO byzantineDAO = context.getBean(ByzantineDAO.class);
        ByzantineDAO byzantineDAO2 = context.getBean(ByzantineDAO.class);

        LOGGER.info("{}", byzantineDAO);
        LOGGER.info("{}", byzantineDAO.getByzantine());

        LOGGER.info("{}", byzantineDAO2);
        LOGGER.info("{}", byzantineDAO2.getByzantine());
        LOGGER.info("{}", byzantineDAO2.getByzantine());

    }
}
