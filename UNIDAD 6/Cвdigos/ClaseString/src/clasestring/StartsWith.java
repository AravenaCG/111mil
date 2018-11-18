/*
*startsWith("expresion"), me informa si la cadena de caracteres a la que le aplico este metodo comienza
*con el caracter que le indico como parametro.
*Devuelve un boolean.
*/
package clasestring;

import java.util.Scanner;

/**
 *
 * @author Emiliano Papasidero
 */
public class StartsWith {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String palabra;
 
        System.out.print("Ingrese una palabra : ");
        palabra = entrada.nextLine();

            if(palabra.endsWith("JA") || palabra.endsWith("ja")){           
                System.out.println("La palabra termina con el sufijo JA");
            }           
            else if(palabra.startsWith("G")){         
                System.out.println("La palabra comienza con la G");
            }
            else{          
                System.out.println("La palabra comienza con otra letra que no es la G, pero tampoco termina con el sufijo -ja");
            }
    }
    
}
