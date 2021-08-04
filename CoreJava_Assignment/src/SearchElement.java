import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
	public static void main(String args[])
	{
		int no,flag = 0;
		System.out.println("Given array is :");
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter number to search");
		Scanner scan=new Scanner(System.in);
		no=scan.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==no)
			{
				System.out.println("Number Found at "+ ++i +" position !");
				flag=1;
			}	 
		}	
		if(flag==0)
			System.out.println("Number is not in the list.");
		scan.close();
	}

}
