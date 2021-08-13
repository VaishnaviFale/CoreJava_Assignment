package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
 
public class Lambda4 {
    public static void main(String[] args) {
    	
        ArrayList<String> arrayList = new ArrayList<String>(
                Arrays.asList("Vaishnavi", "Sanjay", "Fale","Tanuj"));      
         
        Predicate<String> filter = str -> (str.length() %2 != 0);
        
        System.out.println("Original ArrayList          : " + arrayList);
        
         arrayList.removeIf(filter);
      
        System.out.println("ArrayList after removeIf()  : " + arrayList);
    }
}