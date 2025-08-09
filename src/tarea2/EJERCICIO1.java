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
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = lector.nextInt();
        if ((num >= 1) && (num <= 9)) {
            System.out.println("El numero tiene una cifra");
        } else if ((num >= 10) && (num <= 99)) {
            System.out.println("El numero tiene dos cifras");
        } else if ((num >= 100) && (num <= 999)) {
            System.out.println("El numero tiene tres cifras");
        } else {
            System.out.println("ERROR EL NUMERO TIENE MAS DE TRES CIFRAS");
        }

    }

}
