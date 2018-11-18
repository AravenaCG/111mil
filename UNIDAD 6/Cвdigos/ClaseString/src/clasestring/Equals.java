/*
*Uso de equals(String C) -->>  boolean : Se usa para comparar cadenas, 
*nos devuelve un booleano, "true" si son iguales, "false" si son diferentes, 
*respeta las mayúsculas/minúsculas o sea que "JAVA" es diferente a "java". 
*/
package clasestring;

import java.util.Scanner;

/**
 *
 * @author Emiliano Papasidero
 */
public class Equals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String palabra1;
        String palabra2;

        System.out.print("Ingrese palabra 1 : ");
       palabra1 = entrada.nextLine();
       
        System.out.print("Ingrese palabra 2 : ");
        palabra2 = entrada.nextLine();
 
        if( palabra1.equalsIgnoreCase(palabra2) )//equalsIgnoreCase no respeta las mayúsculas/minúsculas
        {
            System.out.println("Las palabras son iguales");
        }
        else
        {
            System.out.println("Las palabras no son iguales");
        }
    }
    
}
