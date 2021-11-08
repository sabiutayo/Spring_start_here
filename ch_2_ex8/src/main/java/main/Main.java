package main;

import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Supplier<Parrot> parrotSupplier = () -> new Parrot().setName("Kiki");
        context.registerBean("parrot1",
                Parrot.class,
                parrotSupplier);
        context.registerBean("parrot2",
                Parrot.class,
                () -> new Parrot().setName("Miki"),
                beanDefinition -> beanDefinition.setPrimary(true));
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        System.out.println(context.getBean(Parrot.class));
    }
}
