import java.util.Scanner;
public class prog3 {
	public static void main(String args[])
	{

		Scanner scr = new Scanner(System.in);
		int arr[],n,pcount=0,ncount=0,zcount=0;
		System.out.println("Enter n : ");
		n = scr.nextInt();
		arr = new int [n];
		System.out.println("Enter the elements of the array : \n");
		for(int i=0;i<n;i++)
		{
			arr[i]=scr.nextInt();
			if(arr[i]>0)
				pcount++;
			else if(arr[i]<0)
				ncount++;
			else 
				zcount++;
		}
		
		System.out.println("number of positive integers = "+pcount+"\nnumber of negative integers = "+ncount+"\nnumber of zeros = "+zcount);
		
	}
}
