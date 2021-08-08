abstract class Persistence
{
   abstract void persist();
   void show()
   {
	   System.out.println();
	   System.out.println("***We are in Abstract Class***");
   }
}

class FilePersistence extends Persistence
{
	void persist() {
		System.out.println();
		System.out.println("FilePersistence");
		
	}
	
}
class DatabasePersistence extends Persistence
{
	void persist() {
		System.out.println();
		System.out.println("DatabasePersistence");
		
	}
	
}
public class abstractClient
{
 public static void main(String args[]) {
	 /*FilePersistence r=new FilePersistence();
	 r.show();*/
	 Persistence p= new DatabasePersistence();
	 p.persist();	 
	 
 }
}
