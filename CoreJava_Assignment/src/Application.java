import java.util.Scanner;
import java.util.*;
public class Application {
	public static void main(String args[])
	{    
	    int i=0,flag=0;
		while(i<3) {
			
		Scanner scan= new Scanner(System.in); 
		System.out.println("Please Enter your Login Name :");
		String user= scan.nextLine();   
		System.out.println("Please Enter your Password :");
		String pwd= scan.nextLine(); 
		String user1="Vaishnavi";
		String pwd1="root";	
		if(user1.equals(user) && pwd1.equals(pwd))
		{
			System.out.println("Welcome.."+user1);
			flag=1;
			break;
		}
		System.out.println();
		System.out.println("Incorrect Login Name or Password !");
		System.out.println("***Try Again***");
		System.out.println();
		i++;
		}
		if(flag==0)
		{ System.out.println();
		System.out.println("***Contact Admin***");}
		
	}

}
