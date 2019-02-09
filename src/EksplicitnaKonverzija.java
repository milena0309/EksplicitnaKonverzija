
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milena
 */
public class EksplicitnaKonverzija {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // konverzija double u int
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite realan broj");
        double broj = sc.nextDouble();
        
        int rez = (int)broj;
        
        System.out.println("Rezultat je: " + rez);
        
        // konverzija int u double
        
        System.out.println("Unesite ceo broj");
        int broj2 = sc.nextInt();
        
        double rez2 = broj2;
        
        System.out.println("Rezultat je: " + rez2);
        
        
        
        
        
        
    }
    
}
