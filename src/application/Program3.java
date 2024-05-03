package application;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        // Ler a linha de entrada
        System.out.println("Your Message:");
        String msg = dado.nextLine();

        int happy = 0;
        int sad = 0;

        for (int i = 0; i < msg.length() - 1; i++){
            if (msg.charAt(i) == ':' && msg.charAt(i + 1) == '-' && msg.charAt(i + 2) == ')')
                happy++;

            if (msg.charAt(i) == ':' && msg.charAt(i + 1) == '-' && msg.charAt(i + 2) == '(')
                sad++;
        }

        String feeling = happy > sad ? "HAPPY" :
                sad > happy ? "SAD" : "NEUTRAL";

        System.out.println("Message: " + msg);
        System.out.println("Feeling expressed in the message: " + feeling);

        dado.close();
    }
}