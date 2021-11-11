package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Parrot {
    private String name;

    public String getName() {
        return name;
    }

    public Parrot() {
        System.out.println("Parrot created");
    }

    public Parrot setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Parrot name: " + name;
    }
}
