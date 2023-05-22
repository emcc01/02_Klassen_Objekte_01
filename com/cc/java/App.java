package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable


        Cat cat1 = new Cat();
        output("Blick von aussen " + cat1); //kurzer Verweis
        output(cat1.tellYourAddress());


        App.output("--------------"); //ausführlich

        Cat cat2 = new Cat();
        output("Blick von aussen2 " + cat2);
        output(cat2.tellYourAddress()); //Fkt steht in cat2
     
     
        
    }


    public static void output(String outStr) {
        System.out.println(outStr);
    }
}
//output muss statisch gemacht werden, damit main bescheid weiss
