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
public class morseCode {
    Scanner in=new Scanner(System.in);
   /* char [] source={' ','e','t','a','o','i','n','s','r','h','d',  
        'i','u','c','m','f','y','w','g','p','b','v','k','x','q',
      'j','z' };
   /* String [] code={".","-","..",".-","-.","--","...","..-",".-.",".--",
        "-..","-.-","--.","---","....","...-","..-.","..--",".-..",
        ".-.-",".--.",".---","-...","-..-","-.-.","-.--","--..",
        "--.-"};
         */ 
    char [] source={' ','h','e','i','s','r','g','b'};
    String [] code={"0","00","01","1","11","000","10","001"};
    String  sour="";
    String counstr="";
    String recounstr="";
        
       
        
   
        
   public void decoiding(){
      int  index = 0;
      sour=source.toString();
       System.out.println("enter the data");
       source=in.next(sour).toCharArray(); 
          sour.split(" ");
          for(int i=0;i<source.length;i++){ 
        for(int j=0;j<code.length;j++){
             recounstr=recounstr+source[i];
             recounstr=code[j];
            System.out.println(code[j]);
        
        
        }
        }
       
       
   }
   public void Encoding(){ 
       
        for(int i=0;i<source.length;i++){
            counstr=counstr+code[i];
            
             System.out.println(source[i]);
             
        }
            
            
            
       
       
   } 
  
}
