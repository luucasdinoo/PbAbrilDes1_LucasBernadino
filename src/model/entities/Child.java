package model.entities;

public class Child extends Person2{
    private Adult responsible;
    private String name;
    private Integer age;
    public Child(String name, Integer age, Adult responsible) {
        super(name, age);
        this.responsible = responsible;
        this.name = name;
        this.age = age;
    }
    public Child(String name, Integer age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }
    public Adult getResponsible() {
        return responsible ;
    }
}
