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
        Scanner entrada=new Scanner(System.in);
        int opcion= entrada.nextInt();
        
        switch(opcion){
            case 1:
                menu();
                break;
            case 2:
                menu();
                break;
            default:
                
        }       
    }
    
}
