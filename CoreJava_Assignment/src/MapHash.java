import java.util.*;  
public class MapHash{  
 public static void main(String args[]){  
   HashMap<Integer,Double> map=new HashMap<Integer,Double>();
   
   map.put(1,11.11);  
   map.put(2,22.22);    
   map.put(3,33.33);   
   map.put(4,44.44); 
   map.put(5,55.55); 
   map.put(6,66.66); 
   map.put(7,77.77); 
   map.put(8,88.88); 
   map.put(9,99.99); 
   map.put(10,10.101); 
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet())
   {    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  