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
public class Ejercicio1 {

    /**
     * 1. Construir un array de caracteres que contenga las letras de la ‘A’ a la ‘Z’
     * (solo las mayúsculas sin tener en cuenta las letras 'Ñ', 'LL'...). 
     * Posteriormente se pedirán posiciones del array por teclado 
     * y, si la posición es correcta, 
     * se añadirá el carácter correspondiente a una cadena que se imprimirá al final,
     * se dejará de insertar cuando se introduzca un número negativo.
        Por ejemplo, si se introducen los siguientes números:
         0 // Se añade la ‘A’
         6 // Se añade la ‘G’
         25 // Se añade la ‘Z’
        50 // Insertar números entre 0 y 25
        -3 // Fin

Cadena final: AGZ
     */
    public static void main(String[] args) {
        char [] arrayABC = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S','T','U','V','W','X','Y','Z'};
        int pos;
        String cadenaFinal="";
        do{
             pos= Integer.parseInt(JOptionPane.showInputDialog("Introducir posición"));
             if(pos>=0 && pos<=25){
                 cadenaFinal+= arrayABC[pos];
             }
             else if(pos>25){                 
                 //JOptionPane.showMessageDialog(null, "Posicion no valida \nInsertar números entre 0 y 25");
                 JOptionPane.showMessageDialog(null, "Posicion no valida \nInsertar números entre 0 y 25",
                         "Error",1);
             }
             else if(pos<0){
                 JOptionPane.showMessageDialog(null, "Ha decidido parar de insertar");
                 
             }
        }while(pos>=0);
        JOptionPane.showMessageDialog(null, ("Cadena final -> " + cadenaFinal));
        
    }
    
}
