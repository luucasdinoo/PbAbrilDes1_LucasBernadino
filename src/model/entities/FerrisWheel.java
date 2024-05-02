package model.entities;

import java.util.ArrayList;
import java.util.List;

public class FerrisWheel {

    private List <Waggon> waggons ;
    public FerrisWheel(int numberOfWaggons){
        this.waggons = new ArrayList<>();
        for (int i = 0; i < numberOfWaggons; i++){
            this.waggons.add(new Waggon());
        }
    }
    public void board(int i, Person2 p1, Person2 p2) {
        Waggon w = new Waggon(i,p1,p2);
        if (p1 instanceof Child || p2 instanceof Child){
            if (p1.getAge() < 12 || p2.getAge() < 12 && ((Child)p1).getResponsible() == null || ((Child)p2).getResponsible() == null){
                System.out.println("ERROR:");
                System.out.println(p1.getName() + " is under 12 years old and without a guardian");
            }
        }
        waggons.set(i-1,w);
    }
    public void board(int i, Person2 p1) {
        Waggon w = new Waggon(i,p1);
        if (p1 instanceof Child ){
            if (p1.getAge() < 12){
                System.out.println("ERROR:");
                System.out.println(p1.getName() + " is under 12 years old and alone");
            }
        }
        waggons.set(i-1,w);
    }
    public void status() {
        System.out.println();
        System.out.println("Waggon Status");
        System.out.println("------------------------");
        int count = 1;

        for (Waggon w : waggons){

            String build = count + "° " + (w.getSeat1() == null && w.getSeat2() == null ? "(Empty)" :
                    w.getSeat1() != null && w.getSeat2() != null ? w.getSeat1().getName() + " e " + w.getSeat2().getName() :
                    w.getSeat1() == null && w.getSeat2() != null ? "Only " + w.getSeat2().getName() :
                    w.getSeat2() == null && w.getSeat1() != null ? "Only " + w.getSeat1().getName() : "...");

            System.out.println(build);
            count++;
        }
    }
}
