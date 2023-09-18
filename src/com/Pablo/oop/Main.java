package com.Pablo.oop;

import com.Pablo.oop.model.Student;

public class Main {


    public static void main(String[] args) {

        //Instantiate Object
        Student benny = new Student("Benny", 15, true);
        Student frida = new Student( "Frida", 22, false);

        System.out.println("Name:" + benny.name + " Age:" + benny.age);
        if (benny.isTired = true) {
            System.out.println("Dang im tired bruh!");
        }
        System.out.println("Name:" + frida.name + " Age:" + frida.age);
        if (frida.isTired = false) {
            System.out.println("Dang im tired bruh!");
        }
            else{
                System.out.println("Im not tired bruh!");
            }


    }
}
