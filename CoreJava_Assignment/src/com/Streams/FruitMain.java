package com.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
 

public class FruitMain{  
 public static void main(String args[]){  
	 List<Fruit> list=new ArrayList<Fruit>();  
	 Fruit f1= new Fruit("Apple",20,50,"Red");
	 Fruit f2= new Fruit("Banana",30,100,"White");
	 Fruit f3= new Fruit("Mango",40,150,"Yellow");
	 Fruit f4= new Fruit("Grapes",90,200,"Green");
	 Fruit f5= new Fruit("Cherry",100,250,"Red");
 
      list.add(f1);  
      list.add(f2);
      list.add(f3);
      list.add(f4);
      list.add(f5);
      
       
      for(Fruit b:list){  
          System.out.println("Name :"+b.name+" Calories :"+b.calories+" Price:"+b.price+
        " Color:"+b.color);
              }   
      System.out.println(); 
      //1 
      list.stream()
      .filter(f -> f.getCalories()<100)
      .sorted(Comparator.comparing(Fruit::getCalories).reversed())
      .forEach(name ->System.out.println(name.toString()));
      
      //2
      System.out.println(); 
      System.out.println("Colour Wise List Of Fruits Name : "); 
      list.forEach((Fruit) -> {
    	  System.out.println("Name :"+Fruit.getName() +"   Color :"+Fruit.getColor());});
      
      //3
      list.stream()
      .filter(f -> f.getColor().matches("Red"))
      .sorted(Comparator.comparing(Fruit::getPrice))
      .forEach(name ->System.out.println(name));
         	  
 }  
} 








