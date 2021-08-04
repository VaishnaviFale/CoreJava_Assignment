import java.util.Scanner;
public class ArmstrongNo {
	public static void main(String args[])
	{
		int c = 0,a,temp;
		System.out.println("Enter Number to Check");
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		temp=n;
		while(n>0){
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
			System.out.println(+temp+" is a Armstrong Number.. ");
		else
			System.out.println(+temp+" is Not a Armstrong Number.. ");
		scan.close();
	}
}
