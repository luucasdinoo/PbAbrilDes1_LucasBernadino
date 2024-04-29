package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Person spouse;
    private List<Person> children = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public Person(String name,Person spouse) {
        this.name = name;
        this.spouse = spouse;
    }

    public void addSpouse(Person spouse){
        this.spouse = spouse;
    }

    public void addChild(Person child){
        children.add(child);
    }

    public void printFamilyTree(){

    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", spouse=" + spouse +
                '}';
    }
}
