/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA1
 */
public class separacion_digitos {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("introdusca un numero de cinco cifras y sera impreso con espacios");
        numero = entrada.nextInt();
        System.out.printf("%d ",  numero/10000);
        System.out.printf("%d ", (numero%10000)/1000);
        System.out.printf("%d ", ((numero%10000)%10000)/100);
        System.out.printf("&d ", (((numero%10000)%1000)%100)/10);
        System.out.printf("%d ", ((((numero%10000)%1000)&100)%10));
        
        
    }
    
}//fin main 
    


