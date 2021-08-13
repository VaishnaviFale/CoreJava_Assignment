package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda6 {
public static void main(String[] args) {
    	
        ArrayList<String> arrayList = new ArrayList<String>(
                Arrays.asList("Vaishnavi", "Sanjay", "Fale"));  
        
        System.out.println("Original List          : " + arrayList);
        
        arrayList.replaceAll( e -> e.toUpperCase() );  
        
        System.out.println("Updated List           : " + arrayList);
        
     
}

}