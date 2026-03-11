package org.example;

import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nombre = "Hugo Navarro Miota";

        System.out.println("¡Bienvenido al programa de " + nombre + "!");

        System.out.print("Por favor, escriba su nombre con sus apellidos: ");
        String nombre_usuario = sc.nextLine();

        System.out.println("Hola, " + nombre_usuario);
        sc.close();
    }
}