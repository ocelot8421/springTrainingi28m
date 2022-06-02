package hu.a04componentScanAndLogger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ButterflyDAO {
    @Autowired
    Butterfly butterfly;

    public Butterfly getByzantine() {
        return butterfly;
    }

    public void setByzantine(Butterfly butterfly) {
        this.butterfly = butterfly;
    }
}
