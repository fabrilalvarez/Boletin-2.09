/*Convertir cantidad entera de dinero,
 que esta en billetes de 100,20,5 y monedas de 1€
 */
package boletin2.pkg9;

import java.util.Scanner;

public class Boletin209 {

    public static void main(String[] args) {
        // Código de la aplicación.
        // x=B100€ y=B20€ z=B5€ v=1€ cent=centimos t=Total
        float x, y, z, v,  t; //cent
        System.out.println("Intrudizca uss respectivo dinero");
        Scanner dato = new Scanner(System.in);
        System.out.println("Billetes de 100€: ");
        x = dato.nextFloat();
        System.out.println("Billetes de 20€: ");
        y = dato.nextFloat();
        System.out.println("Billetes de 5€: ");
        z = dato.nextFloat();
        System.out.println("Monedas de 1€: ");
        v = dato.nextFloat();
        //System.out.println("Centimos de €: ");
        //cent=dato.nextFloat ();

        x = x * 100;
        y = y * 20;
        z = z * 5;
        v = v * 1;
        //cent=cent*10^-1;? //Añadir cent cuando la operacion este operativa
        t = x + y + z + v;

        System.out.println("Dinero Total: " + t + " €");

    }

}
