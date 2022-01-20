/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosmatrices;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno Tarde
 */
public class Ejercicio2 {

    /**
     * 2. Mejorar el programa anterior de forma que el array de caracteres con
     * las letras de la ‘A’ a la ‘Z’ se rellene de forma automática teniendo en
     * cuenta que en la tabla ASCII la letra 'A' corresponde al número 65 y la
     * letra 'Z' corresponde al número 90.
     * (https://es.wikipedia.org/wiki/ASCIIEnlaces a un sitio externo.)
     */
    public static void main(String[] args) {
        char[] arrayABC = new char[26];
        int a = 65;
        int pos;
        String cadenaFinal = "";
        for (int i = 0; i < 26; i++) {
            arrayABC[i] = (char) a;
            a++;
        }
        do {
            pos = Integer.parseInt(JOptionPane.showInputDialog("Introducir posición"));
            if (pos >= 0 && pos <= 25) {
                cadenaFinal += arrayABC[pos];
            } else if (pos > 25) {
                //JOptionPane.showMessageDialog(null, "Posicion no valida \nInsertar números entre 0 y 25");
                JOptionPane.showMessageDialog(null, "Posicion no valida \nInsertar números entre 0 y 25",
                        "Error", 1);
            } else if (pos < 0) {
                JOptionPane.showMessageDialog(null, "Ha decidido parar de insertar");

            }
        } while (pos >= 0);
        JOptionPane.showMessageDialog(null, ("Cadena final -> " + cadenaFinal));

    }

}
