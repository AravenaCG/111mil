/*
*Uso de substring(int Inicio, int Final) -->> String : Se usa para capturar una subcadena, 
*captura desde la variable "Inicio" hasta "Final", 
*o sea si la cadena es "JAVACFP" e "Inicio = 4" y "Final = "7" nos devolvera la subcadena "CFP", 
*si no existe la subcadena nos tirará un error que lo podemos manejar con "try-catch", 
*pero eso lo veremos en POO., Indice final= indice pasado-1
*/
package clasestring;

import java.util.Scanner;

/**
 *
 * @author Emiliano Papasidero
 */
public class Substring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String palabra,palabra2;
 
        System.out.print("Ingrese una palabra : ");
        palabra = entrada.nextLine();
 
        palabra2 = palabra.substring(4,8);
 
        System.out.println("Sub-palabra desde la posicion 4 a la 8 : " + palabra2);
    }
    
}
