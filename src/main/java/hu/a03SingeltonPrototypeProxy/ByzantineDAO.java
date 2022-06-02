package hu.a03SingeltonPrototypeProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ByzantineDAO {
    @Autowired
    Byzantine byzantine;

    public Byzantine getByzantine() {
        return byzantine;
    }

    public void setByzantine(Byzantine byzantine) {
        this.byzantine = byzantine;
    }
}
