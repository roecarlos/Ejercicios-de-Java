
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
public class Ejercicio7 {
     public static void main(String[] args) {
         Scanner leer;
         leer = new Scanner(System.in);
         
         int motor;
         
         System.out.println("Tipo de motor para mover fluidos ingrese un valor entre 1 y 4");
         motor= leer.nextInt();
         
         switch(motor){
             
             case 1:
                 System.out.println("La bomba es una bomba de agua");
                 break;
             case 2:
                 System.out.println("La bomba es una bomba de gasolina");
                 break;
             case 3: 
                 System.out.println("La bomba es una bomba de hormigón");
                 break;
             case 4:
                 System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
             default:
                 System.out.println("No esxite un valor válido para este tipo de bomba");
         }
         
         
                 
     }
}
