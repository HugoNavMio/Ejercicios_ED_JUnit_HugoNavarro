package org.example;

import java.util.Scanner;

public class PruebasJava {
    public static int suma_pares(int cantidad) {
        int suma = 0;
        int valor = 2;
        for (int i = 1; i <= cantidad; i++, valor += 2) {
            suma += valor;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Cantidad de números pares a sumar: ");
        int cantidad = Integer.parseInt(sc.nextLine());
        int suma = suma_pares(cantidad);
        System.out.println("La suma de los " + cantidad + " pares es: " + suma);
        sc.close();
    }
}