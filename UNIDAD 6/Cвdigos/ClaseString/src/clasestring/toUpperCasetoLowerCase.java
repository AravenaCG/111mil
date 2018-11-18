/*
*toUpperCase=Devuelve la cadena que le pasamos como parámetro enteramente en mayúsculas.
*toLowerCase=Devuelve la cadena que le pasamos como parámetro enteramente en minúsculas.
*/
package clasestring;
import java.util.Scanner;
/**
 *
 * @author Emiliano Papasidero
 */
public class toUpperCasetoLowerCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabraUp;
        String palabraLow;
            
       System.out.print("Ingrese una palabra : ");
       palabraUp = entrada.nextLine();
       
       System.out.print("Ingrese otra palabra : ");
       palabraLow = entrada.nextLine();
       
        palabraUp = palabraUp.toUpperCase();
        palabraLow = palabraLow.toLowerCase();
 
        System.out.println("La primera palabra toUpperCase es \"" + palabraUp + "\" "
                + "La segunda palabra toLowerCase es \"" + palabraLow + "\"");
    }   
}
