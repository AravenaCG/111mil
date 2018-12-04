/*
 * Observa que al crear un objeto de la clase ArrayList 
*hay que indicar el tipo de dato que se almacenará en las celdas de esa lista. 
*Para ello se utilizan los caracteres < y >. No hay que olvidar los paréntesis del final. 
*Es necesario importar la clase ArrayList para poder crear objetos de esta clase, 
*para ello debe aparecer al principio del programa la línea import java.util.ArrayList;.
*Algunos IDEs (por ej. Netbeans) insertan esta línea de código de forma automática.

 */
package arraylist1;
import java.util.List;// Es necesario importar la clase ArrayList para poder crear objetos de esta clase,
                      
import java.util.ArrayList;
/**
 *
 * @author jlfum
 */               
public class Arraylist1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        /*Declaramos la lista del tipo dinámico "List" y creamos el objeto que contendrá la variable lista 
       (un ArrayList de String)*/
       lista.add("Azul");
       lista.add("Rojo");
       lista.add("Blanco");
       lista.add("Amarillo");
       lista.add("Negro");
       //Agregamos elementos (objetos tipo String) a la lista
       System.out.println("Estos son los " + lista.size() + " colores que contiene la lista:\n");
//Mensaje opcional
       for(String color: lista){
//Usamos un for each (for extendido) para recorrer la lista y analizar su contenido
        System.out.println("\t\t " + color);
//Cada elemento que se encuentre durante la ejecución del for each sera mostrado por pantalla
        
        // TODO code application logic here
    
       }
    }
}

