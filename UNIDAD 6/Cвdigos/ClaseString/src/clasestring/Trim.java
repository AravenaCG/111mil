/*
*
*trim() devuelve la misma cadena que ingresamos sin los espacios del principio o del final.
*/
package clasestring;
import java.util.Scanner;
/**
 *
 * @author Emiliano Papasidero
 */
public class Trim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra;

       System.out.print("Ingrese una palabra : ");
       palabra = entrada.nextLine();
       
       palabra=palabra.trim();
       
       System.out.println("La palabra sin espacios al principio o al final es: "+palabra);
    }   
}
