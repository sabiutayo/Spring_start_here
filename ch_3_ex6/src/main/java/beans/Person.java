package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    private Parrot parrot;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }
    @Autowired
    public Person setParrot(Parrot parrot) {
        this.parrot = parrot;
        return this;
    }

    public Parrot getParrot() {
        return parrot;
    }

}
