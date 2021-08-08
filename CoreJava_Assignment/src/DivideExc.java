import java.util.Scanner;
public class DivideExc {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Dividend");
		int no1=scan.nextInt();
		System.out.println("Enter Divisor");
		int no2=scan.nextInt();
		
		try {
			int result=no1/no2;
			System.out.println("Result is : "+result);
			}
		catch(ArithmeticException ex){
			System.out.println("***Cannot be divided by Zero*** "+ex);	
		}
		scan.close();
	}

}
