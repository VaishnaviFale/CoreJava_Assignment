import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;  
class ClassEmployee1 implements Comparable<ClassEmployee1>{  
int id;  
String name,department,salary;   
public ClassEmployee1(int id, String name, String department, String salary) {  
    this.id = id;  
    this.name = name;  
    this.department = department;  
    this.salary = salary; 
}  
public int compareTo(ClassEmployee1 b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    return 0;  
    }  
}  
}  
public class ClassTreeSet {  
public static void main(String[] args) {  
	System.out.println("Choose the following option");  
	System.out.println("a.Id"+'\n'+"b.Name"+'\n'+"c.Department"+'\n'+"d.Salary"+'\n');
    Scanner scan=new Scanner(System.in);
    System.out.println("Your Choice :"); 
    String choise=scan.nextLine();
	Set<ClassEmployee1> set=new TreeSet<ClassEmployee1>();  
   
    ClassEmployee1 b1=new ClassEmployee1(100,"Vaishnavi","IT","380000");  
    ClassEmployee1 b2=new ClassEmployee1(200,"Tanuj","CSE","3800");  
    ClassEmployee1 b3=new ClassEmployee1(300,"Kushal","PRODUCTION","300000");  
   
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    switch(choise)
    {
    case "a":
    	for(ClassEmployee1 b:set){  
    	    System.out.println(" A)Id is :"+b.id+" B)Name is :"+b.name+" C)Department is :"+b.department+" D)Salary is :"+b.salary);  
    	    }  
    	break;
    case "b":
    	for(ClassEmployee1 b:set){  
    	    System.out.println(" A)Name is :"+b.name+" B)Id is :"+b.id+" C)Department is :"+b.department+" D)Salary is :"+b.salary);  
    	    }  
    	break;
    case "c":
    	for(ClassEmployee1 b:set){  
    	    System.out.println(" A)Department is :"+b.department+" B)Id is :"+b.id+" C)Name is :"+b.name+" D)Salary is :"+b.salary);  
    	    }  
    	break;
    case "d":
    	for(ClassEmployee1 b:set){  
    	    System.out.println(" A)Salary is :"+b.salary+" B)Id is :"+b.id+" C)Name is :"+b.name+" D)Department is :"+b.department);  
    	    }  
    	break;
    
    }
   
  scan.close();
}  
}  
