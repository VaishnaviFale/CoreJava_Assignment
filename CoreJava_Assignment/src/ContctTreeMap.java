import java.util.Collections;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.collection.treeMap.Contact;

public class ContctTreeMap {
	String name;
	String email;
	enum gender
	{
		Male,Female
	}
	gender g;
	public ContctTreeMap(String name, String email, gender g) {
		
		this.name = name;
		this.email = email;
		this.g = g;
	}
	public static void main(String args[]){
		
		TreeMap<Long,ContctTreeMap> obj= new TreeMap<Long,ContctTreeMap>(Collections.reverseOrder());
		ContctTreeMap obj1= new ContctTreeMap("Vaishnavi","vaishnavi@gmail",gender.Female);
		ContctTreeMap obj2= new ContctTreeMap("Tanuj","tanuj@gmail",gender.Male);
		ContctTreeMap obj3= new ContctTreeMap("ARJUN","arjun@gmail",gender.Male);
		
		obj.put((long) 960447134,obj1);
		obj.put((long) 942361189,obj2);
		obj.put((long) 805632145,obj3);
		
		
		for(Entry<Long, ContctTreeMap> entry:obj.entrySet()){    
			 Long key=entry.getKey();  
			 ContctTreeMap b=entry.getValue();  
			 System.out.println("key : "+key);  
		        System.out.println("Details:-  Name : "+b.name+" Email :"+b.email+" Gender :"+""+b.g);   
		        System.out.println();  
			 
		}
		}
	}
	
	
 

