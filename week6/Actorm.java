import java.util.Scanner;
class Actor{
	int id,no_of_movies,no_of_years_exp;
	String name;
	float avg_performance;
	static float max=0.0f;
	static String mname;
	void accept()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter id");
		id = scr.nextInt();
		System.out.println("Enter name");
		name = scr.next();
		System.out.println("Enter number of movies");
		no_of_movies=scr.nextInt();
		System.out.println("Enter experience");
		no_of_years_exp=scr.nextInt();
	}
	
	void calc()
	{
		avg_performance=no_of_movies/no_of_years_exp;
		if(avg_performance>max)
		{
			max=avg_performance;
			mname=name;
		}
	}
	static void display()
	{
		System.out.println("Actor with highest performance : "+mname);
	}
}
public class Actorm {
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter n");
		int n = scr.nextInt();
		Actor a[]=new Actor[n];
		for(int i=0;i<n;i++)
		{
			a[i]=new Actor();
			a[i].accept();
			a[i].calc();
		}
		Actor.display();
		
	}
}
