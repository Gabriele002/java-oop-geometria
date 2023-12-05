package org.lessons.java.geometria;

public class Rettangolo {
    //ATTIBUTI
    int base;
    int altezza;
    int perimetro;
    int area;

    //COSTRUTTORI




    //METODI
    void calcolaAreaAndPerimeter(int base, int altezza) {
        area= base * altezza;
        perimetro = (base + altezza )* 2;
        this.base = base;
        this.altezza = altezza;
    }



    @Override
    public String toString() {
        return "base=" + base +
                ", altezza=" + altezza +
                ", perimetro=" + perimetro +
                ", area=" + area
                ;
    }
}
