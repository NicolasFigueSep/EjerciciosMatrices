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
public class Ejercicio5 {

    /**
     * 5. Crear un array de números y otro de strings de 5 posiciones. 
     * En el array de números se insertarán notas entre 0 y 10 
     * (habrá que controlar que se inserte una nota correcta),
     * la nota puede tener decimales, e
     * n el array de strings se insertarán los nombres de los alumnos.

    Después, crear un array de strings donde se insertarán los resultados de la notas con palabras.

    Si la nota está entre 0 y 4,99 , será un suspenso
    Si está entre 5 y 6,99 , será un bien.
    Si está entre 7 y 8,99 será un notable.
    Si está entre 9 y 10 será un sobresaliente.

    Mostrar por pantalla, el alumno, su nota y su resultado en palabras. Crear los métodos que se consideren convenientes.
     */
    public static void main(String[] args) {
        int tamanio = 2;
        double[] nota = new double[tamanio];
        String[] alumno = new String[tamanio];
        String[] notaPalabra = new String[tamanio];
        for (int i = 0; i < tamanio; i++) {
            alumno[i] = pedirNombreAlumno(i);
            nota[i] = pedirNotaAlumno(i);
            notaPalabra[i]=ponerNotaPalabra(nota[i]);
        }
        for (int i = 0; i < tamanio; i++) {
            JOptionPane.showMessageDialog(null, (alumno[i] + ": " + nota[i] + " " + notaPalabra[i]));
        }
        
    }
    public static String pedirNombreAlumno(int pos){
        String nombreAlumno = JOptionPane.showInputDialog("Introducir alumno " + pos);
        return nombreAlumno;
    }
    public static double pedirNotaAlumno(int pos){
        double nota=0.0;
        do{
            nota = Double.parseDouble(JOptionPane.showInputDialog("Introducir nota entre 0 y 10 \n Para alumno " + pos));
        }while(nota<0);
        return nota;
    }
    public  static String ponerNotaPalabra(double nota){
        String notaPalabra= "";
        if(nota>0 && nota<5){
            notaPalabra+="Suspenso";
        }
        else if(nota>=5 && nota<7){
            notaPalabra+="Bien";
        }
        else if(nota>=7 && nota<9){
            notaPalabra+="Notable";
        }
        else if(nota>=9 && nota<=10){
            notaPalabra+="Sobresaliente";
        }
        return notaPalabra;
    }
}
