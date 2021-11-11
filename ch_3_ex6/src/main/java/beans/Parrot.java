package beans;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;

    public String getName() {
        return name;
    }
    public Parrot(){
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
