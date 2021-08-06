abstract class Animal
{
   abstract void display();
   void show()
   {
	   System.out.println();
	   System.out.println("***We are in Abstract Class***");
   }
}

class Cat extends Animal
{
	void display() {
		System.out.println();
		System.out.println("***This is Cat Class***");
		
	}
	
}
public class AbstractPractice 
{
 public static void main(String args[]) {
	 Animal obj1=new Cat();
	 obj1.show();
	 obj1.display(); 
	 
 }
}
