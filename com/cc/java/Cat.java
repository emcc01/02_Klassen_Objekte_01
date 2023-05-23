package com.cc.java;

public class Cat {

//Variablen in der Klasse = properties, fields, attributes
    public String name;
    public String furColor; //String gross, weil Klasse
    public int age; //int klein, weil primitive


//Constructor (rechte Maus, Source Action)
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

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
