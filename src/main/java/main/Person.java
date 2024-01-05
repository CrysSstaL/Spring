package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ella";
    private Parrot parrot;

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public Parrot getParrot(){
        return parrot;
    }

    // через сеттер
    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

}
