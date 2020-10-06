import java.util.Scanner;
public class prog5 {
	public static void main(String args[])
	{

		Scanner scr = new Scanner(System.in);
		int a[],n,b[],c[],o=0,e=0,sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		float avg=0;
		System.out.println("Enter n : ");
		n = scr.nextInt();
		a = new int [n];
		b = new int [n];
		c = new int [n];
		System.out.println("Enter the elements of the array : \n");
		for(int i=0;i<n;i++)
		{
			a[i]=scr.nextInt();
			if(a[i]%2==0)
			{	
				c[e++]=a[i];
				sum+=a[i];
				if(a[i]>max)
					max=a[i];
				if(a[i]<min)
					min=a[i];
			}
			
			else 
				b[o++]=a[i];
		}
		avg=sum/e;
		System.out.println("Sum : "+sum+"\nAverage : "+avg+"\nMax : "+max+"\nMin : "+min);
		
 }
}
