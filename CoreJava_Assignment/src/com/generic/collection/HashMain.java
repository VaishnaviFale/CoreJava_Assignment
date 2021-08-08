package com.generic.collection;

import java.util.HashSet;

public class HashMain {  
public static void main(String[] args) {  
    HashSet<EmployeeClass> set=new HashSet<EmployeeClass>();  

    EmployeeClass b1=new EmployeeClass(101,"Tanuj","Production",800);  
    EmployeeClass b2=new EmployeeClass(102,"Gaurav","Marketing",4000);  
    EmployeeClass b3=new EmployeeClass(103,"Aniket","Business",6000);  
  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    

  
    for(EmployeeClass b:set){  
    System.out.println(b.id+" "+b.name+" "+b.department+" "+b.salary);  
    }  
}  
}