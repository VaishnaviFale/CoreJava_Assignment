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
		System.out.println("");
		
	}
	
}
class DatabasePersistence extends Persistence
{
	void persist() {
		System.out.println();
		System.out.println("");
		
	}
	
}
public class abstractClient
{
 public static void main(String args[]) {
	 FilePersistence r=new FilePersistence();
	 Persistence r1 = null;
	 r1.show();
 }
}
