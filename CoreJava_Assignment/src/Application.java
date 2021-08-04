import java.util.Scanner;
import java.util.*;
public class Application {
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in); 
		System.out.println("Please Enter your Login Name :");
		String user= scan.nextLine();   
		System.out.println("Please Enter your Password :");
		String pwd= scan.nextLine(); 
		
		String user1="Vaishnavi";
		String pwd1="root";
		int flag=0;
		
		if(user1.equals(user) && pwd1.equals(pwd))
		{
			System.out.println("Welcome.."+user1);
		}
		else if(true)
		{   System.out.println();
			System.out.println("Login name or Password is Incorrect");
			System.out.println("Try Again !");System.out.println();
			System.out.println("Please Enter your Login Name :");
			String user2= scan.nextLine();   
			System.out.println("Please Enter your Password :");
			String pwd2= scan.nextLine(); 
			if(user1.equals(user2) && pwd1.equals(pwd2))
			{
				System.out.println("Welcome.."+user1); flag=1;
			}
			if(flag==0) {System.out.println(); System.out.println("Contact Admin");}
		}
			scan.close();
	}

}
