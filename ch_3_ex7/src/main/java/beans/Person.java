package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    private final Parrot parrot;

    @Autowired
    public Person(@Lazy Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Parrot getParrot() {
        return parrot;
    }

}
