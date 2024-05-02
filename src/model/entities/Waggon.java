package model.entities;

public class Waggon {

    private Integer number;
    private Person2 seat1;
    private Person2 seat2;

    public Waggon(){}

    public Waggon(Integer number, Person2 seat1, Person2 seat2) {
        this.number = number;
        this.seat1 = seat1;
        this.seat2 = seat2;
    }
    public Waggon(Integer number, Person2 seat1) {
        this.number = number;
        this.seat1 = seat1;
        this.seat2 = null;
    }

    public Integer getNumber() {
        return number;
    }

    public Person2 getSeat1() {
        return seat1;
    }

    public Person2 getSeat2() {
        return seat2;
    }

}
