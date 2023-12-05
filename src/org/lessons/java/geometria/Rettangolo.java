package org.lessons.java.geometria;

public class Rettangolo {
    //ATTIBUTI
    int base;
    int altezza;


    //COSTRUTTORI
    Rettangolo(int base, int altezza) {
            this.base = base;
            this.altezza = altezza;
    }

    //METODI
   int area () {
      return base * altezza;
   }
   int perimetro () {
        return (base + altezza) *2;
   }
}
