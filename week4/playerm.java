import java.util.Scanner;
class player{
	int id,scores[],no_of_matches_played;
	String name;
	player()
	{
		id=0;
		no_of_matches_played=0;
		name="";
		
	}
	void input()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter number of matches played : ");
		no_of_matches_played=scr.nextInt();
		System.out.println("Enter id : ");
		id=scr.nextInt();
		scores=new int[no_of_matches_played];
		System.out.println("Enter scores :");
		for(int i=0;i<no_of_matches_played;i++)
		{
			scores[i]=scr.nextInt();
		}
	}
	float avg()
	{
		int sum=0;
		float average;
		for(int i =0;i<no_of_matches_played;i++)
		{
			sum+=scores[i];
		}
		average=sum/no_of_matches_played;
		return average;
	}
	void display()
	{
		System.out.println("Name : "+name+"\nid : "+id+"\nnumber of matches played : "+no_of_matches_played+"\nScores : ");
		for(int i=0;i<no_of_matches_played;i++)
		{
			System.out.println(scores[i]);
		}
	}
}
public class playerm {
	public static void main(String args[])
	{
		player p1 = new player();
		player p2 = new player();
		p1.input();
		p2.input();
		if(p1.avg()>p2.avg())
			p1.display();
		else if(p2.avg()>p1.avg())
			p2.display();
		
		else
		{
			System.out.println("Average of both players is equal ");
			p1.display();
			p2.display();
		}
	}
}
