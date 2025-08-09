/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        char letra;
        System.out.println("ESCRIBA UNA LETRA: ");
        letra = lector.next().charAt(0);
        if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')) {
            System.out.println("ES UNA VOCAL");
        } else if ((letra == 'A') || (letra == 'E') || (letra == 'I') || (letra == 'O') || (letra == 'U')) {
            System.out.println("ES UNA VOCAL");
        } else {
            System.out.println("ES UNA CONSONANTE");
        }
    }

}
