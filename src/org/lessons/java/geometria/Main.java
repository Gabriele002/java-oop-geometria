package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Rettangolo userRectangle = new Rettangolo();

        System.out.printf("Inserisci la base del rettangolo: ");
        int userBase = scan.nextInt();
        System.out.printf("Inseriscimi l'altezza del rettangolo: ");
        int userHight = scan.nextInt();

        System.out.println("Il tuo rettangolo misura : ");

        //FUNZIONE PER CALCOLARE L`ARIA E IL PERIMETRO
        userRectangle.calcolaAreaAndPerimeter(userHight, userBase);
        // STAMPO IN CONSOLE I VALORI OTTENUTI
        System.out.println(userRectangle);
        // CREO L`IMMAGINE

        for (int i=0; i<= userBase; i++) {
            System.out.print("0");
        }


        for (int i = 0; i <userHight ; i++) {
            System.out.println("0");
        }


        for (int i=0; i<= userBase; i++) {
            System.out.print("0");
        }


        scan.close();
    }
}
