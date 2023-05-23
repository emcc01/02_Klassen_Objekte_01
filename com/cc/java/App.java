package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable

// durch Constructor angegeben statt einzelne Wertzuweisungen
        Cat cat1 = new Cat("Grizabella", "white", 29);
       

        //Ausgabe über Methoden statt direkt:
        output(cat1.getName());
        output(cat1.getFurColor());
        output(Integer.toString(cat1.getAge()));


        App.output("--------------"); //ausführlich

        Cat cat2 = new Cat("Alonzo", "grey", 35);
       
       //mit get: getter u setter aus cat Klasse
        output(cat2.getName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge()));
        
    }


    public static void output(String outStr) {
        System.out.println(outStr);
    }
}
//output muss statisch gemacht werden, damit main bescheid weiss
