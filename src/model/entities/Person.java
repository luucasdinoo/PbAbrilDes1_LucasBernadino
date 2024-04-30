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

    public Person(String name,Person mom) {
        this.name = name;
        mom.addChild(this);
    }

    public String getName() {
        return name;
    }

    public void addSpouse(Person spouse){
        this.spouse = spouse;
    }

    public void addChild(Person child){
        children.add(child);
    }

    public void printFamilyTree(int num) {

        String build =  this.getName() + " -- " + (spouse != null ? "Married to: " + spouse.getName() + " -- " + "Children: " : " Single ") ;
        System.out.println(build);

        for (Person child : children){
            child.printFamilyTree(num + 1);
        }
    }
}
