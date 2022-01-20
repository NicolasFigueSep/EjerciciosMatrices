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
public class Ejercicio3 {

    /**
     *   3. Realizar un programa que pida al usuario una frase 
     *  y pase sus caracteres a un array de caracteres. 
     *  Se podrá realizar con o sin métodos de String.
     */
    public static void main(String[] args) {
      String frase;
      frase = JOptionPane.showInputDialog("Introduce una frase: ");
      char [] arrayFrase = new char[frase.length()];
        for (int i = 0; i < arrayFrase.length; i++) {
            arrayFrase[i]=frase.charAt(i);
            System.out.println(arrayFrase[i]);
        }
        System.out.println("");
    }
    
}
