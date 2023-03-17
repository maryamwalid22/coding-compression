/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.compresion;

import java.util.Scanner;

/**
 *
 * @author ALMWUSHOOR
 */
public class CodingCompresion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //char ch;
       // int n=0;
         Scanner in=new Scanner(System.in);
    
        //morseCode m=new morseCode ();
        // statistical s= new  statistical(); 
          /*System.out.println(s.B(10));
           System.out.println(s.Bp(10));
            System.out.println(s.U(255));
            s.C1(255);*/
         //s.Bp(n);
         // s.C1(255);
            //s.C2(255); 
           //s.C3(255);
        //s.Decode(255);  
        Hufman h=new Hufman();
        h.construct();
        
    }
    
}
