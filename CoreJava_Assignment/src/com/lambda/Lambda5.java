package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda5 {
	public static void main(String[] args) {
		List<String> list= Arrays.asList("Vaishnavi","Sanjay" ,"Fale");
		StringBuilder str= new StringBuilder();
		forEach(list, a-> str.append(a.charAt(0)));
		System.out.println(str);
	}
       
	   @SuppressWarnings("hiding")
	static<String> void forEach(List<String> list, Consumer<String> consumer)
       {
      	for(String t : list) {
		consumer.accept(t);
	}
	}
}
