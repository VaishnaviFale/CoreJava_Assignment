import java.util.Scanner;
public class AvgMarks 
{
public static void main(String args[])
{
   float avgA, avgB, avgC;
   int totalA,totalB,totalC;
   int totalS1,totalS2,totalS3;
   float avgS1,avgS2,avgS3;
   
   Scanner scan=new Scanner(System.in);
   System.out.println("Hello Student 1");
   System.out.println("Enter the Marks for Subject A");
   int a1=scan.nextInt();
   System.out.println("Enter the Marks for Subject B");
   int b1=scan.nextInt();
   System.out.println("Enter the Marks for Subject C");
   int c1=scan.nextInt();
   
   System.out.println("Hello Student 2");
   System.out.println("Enter the Marks for Subject A");
   int a2=scan.nextInt();
   System.out.println("Enter the Marks for Subject B");
   int b2=scan.nextInt();
   System.out.println("Enter the Marks for Subject C");
   int c2=scan.nextInt();
   
   System.out.println("Hello Student 3");
   System.out.println("Enter the Marks for Subject A");
   int a3=scan.nextInt();
   System.out.println("Enter the Marks for Subject B");
   int b3=scan.nextInt();
   System.out.println("Enter the Marks for Subject C");
   int c3=scan.nextInt();
   
   totalA=a1+a2+a3;totalB=b2+b3+b1;totalC=c1+c2+c3;
   System.out.println("Toatal Marks of Subject is : A ="+totalA+" B ="+totalB+" C ="+totalC);
   
   avgA=totalA/3;avgB=totalB/3;avgC=totalC/3;
   System.out.println("Average Marks of Subject is : A ="+avgA+" B ="+avgB+" C ="+avgC);
   
   totalS1=a1+b1+c1; totalS2=a2+b2+c2; totalS3=a3+b3+c3;
   avgS1=totalS1/3;  avgS2=totalS2/3;  avgS3=totalS3/3;
   System.out.println("Toatal Marks of Student is : Student1 ="+totalS1+" Student2 ="+totalS2+" Student3 ="+totalS3);
   System.out.println("Average Marks of Student is : Student1 ="+avgS1+" Student2 ="+avgS2+" Student3 ="+avgS3);;
   		   
   scan.close();
}
}