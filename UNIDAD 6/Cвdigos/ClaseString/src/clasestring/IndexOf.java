/*
*Uso de indexOf(String C) -->> int : Se usa para buscar cadenas dentro de otra cadena
*la busqueda empieza del INICIO, nos devuelve el numero de la posicion de la primera coincidencia, 
*o se que si buscamos "JAVA" en la cadena "me gusta JAVA" nos devolvera 9, 
*si no existen coincidencias entonces nos devolverá un valor de "-1"
*/
package clasestring;

import java.util.Scanner;

/**
 *
 * @author Emiliano Papasidero
 */
public class IndexOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        String palabra;
        int posicion;
 
        System.out.print("Ingrese una palabra : ");
        palabra = entrada.nextLine();
 
        posicion = palabra.indexOf("Java");
 
        if(posicion == -1)
        {
            System.out.println("No existen palabras \"Java\" en la palabra ingresada");
        }
        else
        {
            System.out.println("La primera palabra \"Java\" está en la posición : " + (posicion));
        }
    }
    
}
