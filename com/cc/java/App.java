package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable

// durch Constructor angegeben statt einzelne Wertzuweisungen
        Cat cat1 = new Cat("Grizabella", "white", 29);
       

        //Ausgabe über Methoden statt direkt:
        output(cat1.tellYourName());
        output(cat1.tellYourFurColor());
        output(Integer.toString(cat1.tellYourAge()));


        App.output("--------------"); //ausführlich

        Cat cat2 = new Cat("Alonzo", "grey", 35);
       
       
        output(cat2.tellYourName());
        output(cat2.tellYourFurColor());
        output(Integer.toString(cat2.tellYourAge()));
        
    }


    public static void output(String outStr) {
        System.out.println(outStr);
    }
}
//output muss statisch gemacht werden, damit main bescheid weiss
