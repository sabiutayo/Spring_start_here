package main;

import beans.Parrot;
import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);
        parrot.setName("Kiki");
        person.setName("Ella");
        person.setParrot(parrot);
        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's parrot: " + person.getParrot());
    }

}
