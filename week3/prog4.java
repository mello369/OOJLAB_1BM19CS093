import java.util.Scanner;
public class prog4 {
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		double rate[],total=0;
		int qty[],n;
		System.out.println("Enter number of items : \n");
		n = scr.nextInt();
		rate = new double[n];
		qty = new int[n];
		for(int i = 0 ;i<n;i++)
		{
			System.out.println("Enter rate : ");
			rate[i]=scr.nextDouble();
			System.out.println("Enter quantity : ");
			qty[i]=scr.nextInt();
			total+=rate[i]*qty[i];
		}
		if(total>=10000)
			total-=0.05*total;
		else if(total>=7500)
			total-=0.03*total;
		else if(total>=5000)
			total-=0.02*total;
		System.out.println("Total : "+total);
	}
}
