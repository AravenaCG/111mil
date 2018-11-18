/*
* Uso de length() -->> int : Se usa para capturar la longitud que tiene la cadena, 
*o sea que si ponemos "JAVA" nos devolvera 4, que corresponde a su longitud.
*Primera posicion=1
*/
package clasestring;

import java.util.Scanner;

/**
 *
 * @author Emiliano Papasidero
 */
public class Length {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String palabra;
        int longitudPalabra;
 
        System.out.print("Ingrese una palabra : ");
        palabra = entrada.nextLine();
 
         longitudPalabra = palabra.length();
         
         if(longitudPalabra<15){
             System.out.println("La contraseña es muy corta");       
         }
         
         else{
             System.out.println("Contraseña aceptada");
             System.out.println("La longitud de \"" + palabra + "\" es : " +  longitudPalabra);
         }
    }
    
}
