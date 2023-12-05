package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Inserisci la base del rettangolo: ");
        int userBase = scan.nextInt();
        System.out.printf("Inseriscimi l'altezza del rettangolo: ");
        int userHight = scan.nextInt();

        Rettangolo userRectangle = new Rettangolo(userBase,userHight);

        System.out.println("Il tuo rettangolo misura : ");




        //FUNZIONE PER CALCOLARE L`ARIA E IL PERIMETRO

        // STAMPO IN CONSOLE I VALORI OTTENUTI
        System.out.println("Area: " + userRectangle.area());
        System.out.println("Perimetro: " + userRectangle.perimetro());
        // CREO L`IMMAGINE


        for (int i=1; i< userBase; i++) {
            System.out.print("0");
        }


            for (int i = 1; i <= userHight ; i++) {
                System.out.println("0");
                for (int j = 1; j < userBase ; j++) {
                    System.out.print("a");
                }
            }





        for (int i=0; i< userBase; i++) {
            System.out.println();
        }




        scan.close();
    }
}
