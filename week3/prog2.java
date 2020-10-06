import java.util.Scanner;
public class prog2 {
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		int arr[],n,esum=0,osum=0;
		System.out.println("Enter n : ");
		n = scr.nextInt();
		arr = new int [n];
		System.out.println("Enter the elements of the array : \n");
		for(int i=0;i<n;i++)
		{
			arr[i]=scr.nextInt();
			if(i%2==0)
				esum+=arr[i];
			else
				osum+=arr[i];
		}
		
		System.out.println("Sum of even indices = "+esum+"\nSum of odd indices = "+osum);
		
	}
}
