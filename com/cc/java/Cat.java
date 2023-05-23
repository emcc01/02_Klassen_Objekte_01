package com.cc.java;

public class Cat {

//Variablen in der Klasse = properties, fields, attributes
    String name;
    String furColor; //String gross, weil Klasse
    int age; //int klein, weil primitive



    public String tellYourName() {
        return this.name;
    }

    public String tellYourFurColor() {
        return this.furColor;
    }

    public int tellYourAge() {
        return this.age;
        
    }



    public String tellYourAddress() {
        return "Blick von innen " + this;
        // this = Instanzvariable, Selbstreferenz Instanz = Objekt
    }
}
