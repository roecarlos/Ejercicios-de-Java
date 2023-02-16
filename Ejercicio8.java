
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
public class Ejercicio8 {
    public static void main(String[] args) {
         
         Scanner leer= new Scanner(System.in);
         
         int nota;
         
     nota=-1;
         
         
         while (nota<0 || nota>10){
            System.out.println("Ingrese una nota: ");
             nota= leer.nextInt();
             
            if(nota<0 || nota > 10){
                System.out.println("Nota no válida, ingrese una nuevamente");
             nota= leer.nextInt();
         }
         
       
    }
         System.out.println("La nota ingresada es: "+ nota); 
}
}
