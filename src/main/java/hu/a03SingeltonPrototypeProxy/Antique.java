package hu.a03SingeltonPrototypeProxy;

import org.springframework.stereotype.Component;

@Component
public class Antique {
    public Antique() {
        System.out.println("This is antique");
    }
}
