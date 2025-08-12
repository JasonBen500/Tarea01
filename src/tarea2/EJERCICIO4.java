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
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        char opcion;
        System.out.println("--OPERACIONES BASICAS--");
        System.out.println("SELECCIONE UNA OPCION: ");
        System.out.println("S para sumar");
        System.out.println("R para restar");
        System.out.println("M para multiplicar");
        System.out.println("D para dividir");
        opcion = lector.next().charAt(0);
        if ((opcion == 'S') || (opcion == 's')) {
            int num1, num2;
            System.out.println("SUMA");
            System.out.println("Ingrese una cantidad: ");
            num1 = lector.nextInt();
            System.out.println("Ingrese una cantidad: ");
            num2 = lector.nextInt();
            System.out.println("EL RESULTADO ES: " + (num1 + num2));
        } else if ((opcion == 'R') || (opcion == 'r')) {
            int num1, num2;
            System.out.println("RESTA");
            System.out.println("Ingrese una cantidad: ");
            num1 = lector.nextInt();
            System.out.println("Ingrese una cantidad: ");
            num2 = lector.nextInt();
            System.out.println("EL RESULTADO ES: " + (num1 - num2));
        } else if ((opcion == 'M') || (opcion == 'm')) {
            int num1, num2;
            System.out.println("MULTIPLICACION");
            System.out.println("Ingrese una cantidad: ");
            num1 = lector.nextInt();
            System.out.println("Ingrese una cantidad: ");
            num2 = lector.nextInt();
            System.out.println("EL RESULTADO ES: " + (num1 * num2));
        } else if ((opcion == 'D') || (opcion == 'd')) {
            int num1, num2;
            System.out.println("DIVISION");
            System.out.println("Ingrese una cantidad: ");
            num1 = lector.nextInt();
            System.out.println("Ingrese una cantidad: ");
            num2 = lector.nextInt();
            System.out.println("EL RESULTADO ES: " + (num1 / num2));
        } else {
            System.out.println("ERROR NO EXISTE ESA OPCION");
        }
    }

}
//PRUEBA DE CAMBIOS PARA GITHUB
