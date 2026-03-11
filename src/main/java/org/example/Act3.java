package org.example;

public class Act3 {
    public static void main(String[] args) {
        String nombreCompleto = "Hugo Navarro Miota";
        String cadenaBase = "aáàeéèiíoóòuú";
        String cadenaSustitucion = "999333110044";
        String cadena = "";
        for (int i = 0; i < nombreCompleto.length(); i++) {
            int posicion = cadenaBase.indexOf(nombreCompleto.charAt(i));
            if (posicion >= 0) {
                cadena += cadenaSustitucion.charAt(posicion);
            } else {
                cadena += nombreCompleto.charAt(i);
            }
        }
        System.out.println(cadena);
    }
}