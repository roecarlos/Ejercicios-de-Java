
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
public class Ejercicio6 {
        public static void main(String[] args) {
         
         Scanner leer= new Scanner(System.in);
        int numero1;
        int numero2;
        
        System.out.println("Ingrese un número: ");
        numero1= leer.nextInt();
        
        System.out.println("Ingrese otro número: ");
        numero2= leer.nextInt();
        
        if( numero1>=25||numero2>=25) {
            System.out.println("Alguna de las variables es mayor o igual a 25");
        } else {
                System.out.println("Las variables son menores a 25");
                }
        }        
}
