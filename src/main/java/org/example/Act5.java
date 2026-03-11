package org.example;

public class Act5 {
    public static void main(String[] args) {
        int suma = 0;
        String nombre = "HUGO NAVARRO MIOTA";
        for (int i = 'A'; i < 'Z'; i++) {
            suma += i;
            nombre += (char)i;
        }
    }
}