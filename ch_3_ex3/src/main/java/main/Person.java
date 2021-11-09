package main;

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

    public Parrot getParrot() {
        return parrot;
    }

    public Person setParrot(Parrot parrot) {
        this.parrot = parrot;
        return this;
    }
}
