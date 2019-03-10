/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class UI {
    
    
    
    public static void menu(){
        
        System.out.println("BIENVENIDO A ANIMALANDIA");
        System.out.println("1. Mostrar los vertebrados: ");
        System.out.println("2. Motrar los invertebrados: ");
        System.out.println("3. Mostras los extintos: ");
        System.out.println("4. Terminar");
        System.out.println("Digite la opción deseada ");
        Scanner entrada=new Scanner(System.in);
        int opcion= entrada.nextInt();
        
        switch(opcion){
            case 1:
                menu();
                break;
            case 2:
                menu();
                break;
            case 3:
                menu();
            default:
                
        }       
    }
    
}
