package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;
    private final Person person;

    @Autowired
    public Parrot(Person person){
        this.person = person;
    }

    public String getName() {
        return name;
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
