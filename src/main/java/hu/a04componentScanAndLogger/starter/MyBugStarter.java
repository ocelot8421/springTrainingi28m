package hu.a04componentScanAndLogger.starter;

import hu.a04componentScanAndLogger.AntDAO;
import hu.a04componentScanAndLogger.ButterflyDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("hu/a04componentScanAndLogger")
public class MyBugStarter {

    private static Logger LOGGER = LoggerFactory.getLogger(MyBugStarter.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(MyBugStarter.class, args);

        AntDAO antDAO = context.getBean(AntDAO.class);
        AntDAO antDAO2 = context.getBean(AntDAO.class);

        LOGGER.info("{}", antDAO);
        LOGGER.info("{}", antDAO.getAntique());

        LOGGER.info("{}", antDAO2);
        LOGGER.info("{}", antDAO2.getAntique());


        ButterflyDAO butterflyDAO = context.getBean(ButterflyDAO.class);
        ButterflyDAO butterflyDAO2 = context.getBean(ButterflyDAO.class);

        LOGGER.info("{}", butterflyDAO);
        LOGGER.info("{}", butterflyDAO.getByzantine());

        LOGGER.info("{}", butterflyDAO2);
        LOGGER.info("{}", butterflyDAO2.getByzantine());
        LOGGER.info("{}", butterflyDAO2.getByzantine());

    }
}
