package hu.a04componentScanAndLogger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class AntDAO {

    @Autowired
    Ant ant;

    public Ant getAntique() {
        return ant;
    }

    public void setAntique(Ant ant) {
        this.ant = ant;
    }
}
