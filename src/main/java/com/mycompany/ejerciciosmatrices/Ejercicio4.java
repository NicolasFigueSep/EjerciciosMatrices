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
public class Ejercicio4 {

    /**
     * 4. Obtener la letra de un DNI, se pedirá el DNI por teclado 
     * y se nos devolverá el DNI completo.
*Para el cálculo de la letra, se cogerá el resto de dividir el DNI entre 23,
* el resultado debe estar entre 0 y 22. 
* Realizar un método donde reciba el resultado de la anterior fórmula
* y busque en un array de caracteres la posición que corresponde a la letra
     */
    public static void main(String[] args) {
       int dni;
       dni = Integer.parseInt(JOptionPane.showInputDialog("Introducir dni: "));
       char [] letraDni = {'T','R','W','A','G','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
       JOptionPane.showMessageDialog(null, ("DNI: " + dni + letraDni[calculoLetra(dni)]));
        System.out.println("Ejemplo que no vale de nada para lo del \n "
                + " git y la rama y tal");
    }
    public static int calculoLetra(int dni){
        dni=dni%23;
        return ++dni;
    }
    //Se vienen cositasrrrrr
   
}
