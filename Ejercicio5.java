
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author river
 */
public class Ejercicio5 {
     public static void main(String[] args) {
         
         Scanner leer= new Scanner(System.in);
         
        boolean gusto;
        double precio;
        char valor;
        
        System.out.println("¿El producto es de tu grado?");
        gusto= leer.nextBoolean();
        System.out.println("¿Cuanto cuesta el producto?");
        precio= leer.nextDouble();
        System.out.println("¿Cual el valor asignado del 1-10 del producto?"); 
        valor= (char) leer.nextInt();
     }
    
}
