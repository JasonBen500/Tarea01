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
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int monto;
        System.out.println("Ingrese el monto gastado");
        monto = lector.nextInt();
        if ((monto >= 501) && (monto <= 1000)) {
            System.out.println("SUBTOTAL: " + monto);
            System.out.println("Descuento 5%: " + monto * 0.05);
            System.out.println("TOTAL: " + (monto - (monto * 0.05)));
        } else if ((monto >= 1001) && (monto <= 7000)) {
            System.out.println("SUBTOTAL: " + monto);
            System.out.println("Descuento 11%: " + monto * 0.11);
            System.out.println("TOTAL: " + (monto - (monto * 0.11)));
        } else if ((monto >= 7001) && (monto <= 15000)) {
            System.out.println("SUBTOTAL: " + monto);
            System.out.println("Descuento 18%: " + monto * 0.18);
            System.out.println("TOTAL: " + (monto - (monto * 0.18)));
        } else if (monto >= 15001) {
            System.out.println("SUBTOTAL: " + monto);
            System.out.println("Descuento 25%: " + monto * 0.25);
            System.out.println("TOTAL: " + (monto - (monto * 0.25)));
        } else {
            System.out.println("SUBTOTAL: " + monto);
            System.out.println("Descuento 00%: - -");
            System.out.println("TOTAL: " + monto);
        }
    }

}
