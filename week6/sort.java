import java.util.Scanner;
public class sort {
	public static void main(String args[])
	{
		double[] arr=new double[args.length];
		double temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
