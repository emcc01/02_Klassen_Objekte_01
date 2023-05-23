package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable


        Cat cat1 = new Cat();
       
        //Wertzuweisung
        cat1.name = "Grizabella";
        cat1.furColor = "white";
        cat1.age = 29;


        output(cat1.tellYourName());
        output(cat1.tellYourFurColor());
        output(Integer.toString(cat1.tellYourAge()));


        App.output("--------------"); //ausführlich

        Cat cat2 = new Cat();
       
        //Wertzuweisung
        cat2.name = "Alonzo";
        cat2.furColor = "grey";
        cat2.age = 35;

        output(cat2.tellYourName());
        output(cat2.tellYourFurColor());
        output(Integer.toString(cat2.tellYourAge()));
        
    }


    public static void output(String outStr) {
        System.out.println(outStr);
    }
}
//output muss statisch gemacht werden, damit main bescheid weiss
