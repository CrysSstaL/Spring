package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot();
        x.setName("Kiki");
        Supplier<Parrot> parrotSupplierX = () -> x; // обьект x добавляется в контекст
        context.registerBean("parrot1", Parrot.class, parrotSupplierX);

        Parrot y = new Parrot();
        y.setName("Koko");
        Supplier<Parrot> parrotSupplierY = () -> y;
        context.registerBean("parrot2", Parrot.class,
                parrotSupplierY, bc-> bc.setPrimary(true)); // bc - bean customizer!!!

        Parrot p = context.getBean(Parrot.class);  // p - primary
        Parrot q = context.getBean("parrot1",Parrot.class); // get with beanName

        System.out.println(q.getName());
        System.out.println(p.getName());
    }
}

