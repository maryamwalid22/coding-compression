/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.compresion;

/**
 *
 * @author ALMWUSHOOR
 */
public class Hufman {
    char [] charcter={'a','b','c','d','e'};
    String [] code_word=new String [5];
    double [] prop={0.2,0.4,0.1,0.1};
    String temp[]=new String[5]; 
     int i,j;
    int k;
    public int search(char ch){
        
        for( j=0;j<code_word.length;j++){
            code_word[j]="";
    for(i=0;i<charcter.length;i++) {
        if(charcter[i]==ch);
       if(code_word[i]==String.valueOf(ch));
         } 
        } 
      return i;  
    }   
    public void sort(){
       for( j=0;j<code_word.length;j++)
          temp[j]=code_word[j];
         j++;
         if(prop[j]>prop[j+1])
            temp[j+1]=temp[j];
          
    }
    public void add_bit(int i){
        search((char) i);
     for(k=0;k<code_word[i].length();k++)
     if(code_word[i].equals(k-2))
         code_word[i]="0"+code_word[i];
      if(code_word[i].equals(k-1))
         code_word[i]="1"+code_word[i];
     
}
    
    public void insert(){
      temp[k]=temp[k-1]+temp[k]; 
       prop[k-2]=prop[k-1]+prop[k];
       k=k-1;
    }
    public void delete(){
        temp[k-2]=temp[k-2]+temp[k];
        k--;
    }
    public  void construct(){
        add_bit(i);
        delete();
        
    }
}
