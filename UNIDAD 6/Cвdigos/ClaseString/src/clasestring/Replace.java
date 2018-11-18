/*
*Replace, acepta dos strings (String areemplazar,String reemplazarpor) reemplaza todas las palabras iguales a "areemplazar" con
*"reemplazarpor"
*/
package clasestring;
import java.util.Scanner;
/**
 *
 * @author Emiliano Papasidero
 */
public class Replace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra;
        String aReemplazar;
        String reemplazarPor;
        
       System.out.print("Ingrese una palabra : ");
       palabra = entrada.nextLine();
       
       System.out.print("¿Que quiere reemplazar de esa palabra?");
       aReemplazar = entrada.nextLine();
       
       System.out.print("¿Por que palabra quiere reemplazar la palabra anterior?");
       reemplazarPor = entrada.nextLine();

        System.out.println( palabra.replace(aReemplazar,reemplazarPor) );
    }   
}
