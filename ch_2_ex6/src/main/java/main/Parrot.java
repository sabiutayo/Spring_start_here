package main;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
   private String name;

    public String getName() {
        return name;
    }

    public Parrot setName(String name) {
        this.name = name;
        return this;
    }
}
