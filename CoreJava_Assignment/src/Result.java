import java.util.Scanner;

public class Result
{
    public static void main(String args[])
    {
        int sub1,sub2,sub3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Marks of 1st Subject : ");
        sub1= scanner.nextInt();   
        System.out.print("Enter Marks of 2st Subject : ");
        sub2= scanner.nextInt();      
        System.out.print("Enter Marks of 3st Subject : ");
        sub3= scanner.nextInt();      
		
        if(sub1>60 && sub2>60 && sub3>60)
        {
        	System.out.print("You are Passed ! ");
        }
        else if(sub1>60 && sub2>60 && sub3<60)
        {
        	System.out.print("You are Promoted ! ");
        }
        else if(sub1>60 && sub2<60 && sub3>60)
        {
        	System.out.print("You are Promoted ! ");
        	
        }
        else if(sub1<60 && sub2>60 && sub3>60)
        {
        	System.out.print("You are Promoted ! ");
        	
        }
        else if(sub1<60 && sub2<60 && sub3<60)
        {
        	System.out.print("You are Failed ! ");
        }
        else if(sub1>60 && sub2<60 && sub3<60)
        {
        	System.out.print("You are Failed ! ");
        }
        else if(sub1<60 && sub2>60 && sub3<60)
        {
        	System.out.print("You are Failed ! ");
        }
        else if(sub1<60 && sub2<60 && sub3>60)
        {
        	System.out.print("You are Failed ! ");
        } 	
      scanner.close();   
      }
}