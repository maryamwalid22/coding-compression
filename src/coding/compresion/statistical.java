/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.compresion;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author ALMWUSHOOR
 */
public class statistical {
    int[] source=new int[10];
    String [] textcode=new String[2];
    String cons="";
    String str="";
  // Scanner in=new Scanner(System.in);
   public String B(int n){ 
       return Integer.toBinaryString(n);      
   } 
   
   public String Bp(int n){  
       return Integer.toBinaryString(n).substring(1);
   }
   public String U(int n){
       for(int i=0;i<n;i++)
         str=Integer.toString(n);
       str= Integer.toBinaryString(n);
       str=str+0;
       return str;
   } 
   public void C1(int n){
     System.out.println(U(B(n).length())+":"+Bp(n));
   }
   public void C2(int n){
       String temp="";
       C1(n);
       for(int i=0;i<textcode[0].length();i++){
      temp=temp+textcode[0].charAt(i);
       if(i<textcode[0].length()-1)
        temp=temp+textcode[0].charAt(i)+""+textcode[i].charAt(i); 
       }
       textcode[0]=temp;
       textcode[1]=null;
   }
   public void C3(int n){
    C2(n);
   System.out.println(textcode[1]+":"+Bp(n));
    
   }
   public void C4(int n){
   C1(n);
   textcode[0]="0";
   int i=0;
   int temp=n;
   do{
       textcode[i]=B(temp);
      temp=textcode[0].length()-1; 
      
   }while(temp>1);
   }
   public void Decode(int n){
       String temp="",t1,t2;
     
     if(textcode[1]==null){
       temp=textcode[0];
       textcode[1]="";
      temp=textcode[0]+" ";
      for(int i=0;i<textcode.length-1;i++){
    temp=temp+textcode[0].charAt(i);
   if(textcode[0].equals(" "));
   textcode[0].split(" ");
    temp=textcode[0];
      }System.out.println(t1=textcode[0]);
    System.out.println(t2=textcode[1]);
       Integer.parseInt(textcode[0],2);
      } else if (textcode[0].equals("0")){
               C4(n);
         Integer.parseInt(textcode[0],2);     
       }else {
           if(textcode[1]==Bp(n)){
          textcode[1].concat("1");
           C1(n);
         Integer.parseInt(textcode[1],2); 
          }else
        if(textcode[1]==Bp(n))
          textcode[1].concat("1");
            C3(n); 
         Integer.parseInt(textcode[1],2);    
      }
         
   }
 }

