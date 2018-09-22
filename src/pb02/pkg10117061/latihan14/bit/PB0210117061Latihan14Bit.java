/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb02.pkg10117061.latihan14.bit;

/**
 *
 * @author Fachrian Harits Pratama
 * Nama                 : Fachrian Harits Pratama
 * Kelas                : PBO2
 * NIM                  : 10117061
 * Deskripsi program    : Program ini berisi program dengan operator bit
 */
public class PB0210117061Latihan14Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;
        c = a & b;
        
        System.out.println("a & b = " + c);
        
        c = a | b; 
        
        System.out.println("a | b = " + c);
        
        c = a ^ b;
        
        System.out.println("a ^ b = " + c);
        
        c = ~a;
       
        System.out.println("~a = " + c);
        
        c = a << 2;
        
        System.out.println("a << 2 = "  + c);
        
        c = a >> 2;
        
        System.out.println("a >> 2 = " + c);
        
        
                
    }
    
}
