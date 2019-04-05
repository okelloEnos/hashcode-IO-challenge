/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iochallenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author okello
 */
public class Slideshow {
    public static void main(String[] args) throws IOException {
        File file = new File ("D:\\hashcode\\a_example.txt");
        FileInputStream streamFile = new FileInputStream (file);
        InputStreamReader isr = new InputStreamReader (streamFile);
        BufferedReader br = new BufferedReader (isr);
        
        String line;
        //initialization
        int linesCount=0;
        
        //reading an entire file in line by line untill a null is returned
        
        while ((line = br.readLine() )!= null)
        {
            if(!(line.equals(""))){
                
                //[!?.:]+ is the sentence delimeter in java
                String [] lineList = line.split("[.:]");
                linesCount += lineList.length;
                 System.out.println(line);
                 
                 character(line,linesCount);
            }
        }
       System.out.println();
       System.out.println("Number of Lines in the file = "+linesCount);
       
           //method to create a slide
//               slideCreation(line,linesCount);

    }
       
    
//      compareFirstCharacter(lines,count);   
     private static void character(String lines,int NoLines) {
        final int MAX_CHAR = 256;
        
        //Create an array of size 256 i.e ASCII_SIZE 
        
        int count[]= new int[MAX_CHAR];
        
//        int len = lines.length();
        
        //initiallizze count array index 
        
//        for(int i=0;i<len;i++)
            for(int i=0;i<NoLines;i++) 
             count[lines.charAt(i)]++;
        
        //create an array of a given String size 
        
        char ch[]=new char[lines.length()];
        int k = 0,p;
        
        for(int i=0;i<NoLines;i++){
            ch[k]= lines.charAt(0);
//            int find =0;
            for(int j=0;j<=i;j++){
                
                //if any matches found
                
                if(lines.charAt(i)=='V'){ 
                    
//                    find++;
         // what to do when the image is vertical
                System.out.println(i);
                verticalSlide();
            } else   
             if(lines.charAt(i)=='H'){
                 //what to do when it is horizontal
                 System.out.println(i);
               
                    horizontalSlide();
                    }
//            if(find==1)
//                System.out.println("Number of Occurrence of "+lines.charAt(i)+" is:"+count[lines.charAt(i)]);
        

    
                }
    }
    
     }


    private static void verticalSlide() {
        
    }

    private static void horizontalSlide() {
         
    }
          // ADD THE HORIZONTAL PHOTO TO SLIDE      
     }

 
    


