package hu.a03SingeltonPrototypeProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class AntiqueDAO {

    @Autowired
    Antique antique;

    public Antique getAntique() {
        return antique;
    }

    public void setAntique(Antique antique) {
        this.antique = antique;
    }
}
