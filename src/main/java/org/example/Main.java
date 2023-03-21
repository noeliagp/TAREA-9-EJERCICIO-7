package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Noelia","González","Pardo","Programadora Junior");
        Empleado empleado2 = new Empleado("Javier","Bailón","Faba","Programadora Senior");

        Empleado empleado3 = new Empleado("Andrei","Stefan","Stefan","Programadora Senior");

        Lugar Lugar1 = new Lugar(1,"Direccion 1","Pronvincia 1","Localidad 1");


        Proyecto Proyecto1 = new Proyecto("01-01-2023","31-12-2023","Esta es el Proyecto1");

        Proyecto1.AgregarEmpleados(empleado1);
        Proyecto1.AgregarEmpleados(empleado2);


    }
}