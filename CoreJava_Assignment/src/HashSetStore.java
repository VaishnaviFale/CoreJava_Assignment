import java.util.*;  
class HashSetStore{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet();  
           set.add("1.One");    
           set.add("2.Two");    
           set.add("3.Three");   
           set.add("4.Four");  
           set.add("5.Five");  
           set.add("5.Five");  
           set.add("6.six");  
           set.add("7.seven");  
           set.add("8.eight");  
           set.add("9.nine");  
           set.add("10.ten");  
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  