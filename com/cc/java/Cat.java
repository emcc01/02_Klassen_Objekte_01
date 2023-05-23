package com.cc.java;

public class Cat {

//Variablen in der Klasse = properties, fields, attributes
    private String name;
    private String furColor; //String gross, weil Klasse
    private int age; //int klein, weil primitive
// dadurch dass Ausgabe nicht direkt ist, reicht private
//Encapsulation: nur das von aussen zugänglich, was nötig

//Constructor (rechte Maus, Source Action)
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }


    //getter und Setter (rechte Maus, Source Action)
    public String getName() {
        return name;
    }

// wenn set Methode gelöscht wird, nicht mehr von aussen zugänglich

    public void setName(String name) {
        this.name = name;
    }



    public String getFurColor() {
        return furColor;
    }



    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    // public String tellYourName() {
    //     return this.name;
    // }

    // public String tellYourFurColor() {
    //     return this.furColor;
    // }

    // public int tellYourAge() {
    //     return this.age;
        
    // }



    public String tellYourAddress() {
        return "Blick von innen " + this;
        // this = Instanzvariable, Selbstreferenz Instanz = Objekt
    }
}
