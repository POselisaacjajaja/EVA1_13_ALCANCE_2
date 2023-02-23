/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_alcance_2;

/**
 *
 * @author isaaczapatto
 */
public class EVA1_13_ALCANCE_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println(x);
            int x = 100;
            System.out.println(x);
            
            {
             int y = 50;   
                System.out.println(y); //La variable existe, estpa declarada dentro de un mismo bloque.
            }
            
            System.out.println(y); //Ninguna de estas variables existe, pues su declaración está fuera del bloque.
        }
            System.out.println(i);
            System.out.println(x);
        
    }
    
}
