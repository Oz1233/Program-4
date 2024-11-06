/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

/**
 *
 * @author Oleh
 */
public class Mavenproject6 {
    public static void main(String[] args) {
     Car opel = new Car("Opel");
     opel.displayInfo();
    
     Car bmw = new Car ("Bmw",2021);
     bmw.displayInfo();
    
     bmw.updateAge(2023);
     bmw.displayInfo();
    }
}
class Car{

    String name;
    int age;
    
    Car(String name){
        this.name = name;
        this.age = 2006;
    }
    Car(String name, int age){
        this.name= name;
        this.age = age;
    }
    void displayInfo(){
     System.out.printf("Name: %s\tAge: %d\n", name, age);
    }
    void updateAge(int newAge) {
        this.age = newAge;
    }
} 

