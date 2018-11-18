/*
*Uso de charAt( int N) -->> char : Se usa para capturar una letra de la cadena de caracteres, 
*en donde N es la posición de la letra que queremos capturar.
*Primera posicion=0
*/
package clasestring;

import java.util.Scanner;

/**
 *
 * @author Emiliano Papasidero
 */
public class CharAt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner entrada = new Scanner(System.in);
        String palabra;
        char primeraLetra;
        
        System.out.print("Ingrese una palabra : ");
        palabra = entrada.next();
       
        primeraLetra = palabra.charAt(0);
        
        System.out.println("La primera letra de \"" + palabra + "\" ES : " + primeraLetra);
    }
    
}
