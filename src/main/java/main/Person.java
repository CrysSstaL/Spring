package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ella";
    @Autowired
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

    public void setParrot(Parrot p){
        this.parrot = p;
    }
}
