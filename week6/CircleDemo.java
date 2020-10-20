import java.util.Scanner;
public class CircleDemo {
	float radius,area,perimeter;
	void accept()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter radius");
		radius = scr.nextFloat();
	}
	void area()
	{
		area = (3.14f)*radius*radius;
	}
	void perimeter()
	{
		perimeter = 2*(3.14f)*radius;
	}
	void display()
	{
		System.out.println("Details : \nArea : "+area+"\nPerimeter : "+perimeter);
	}
	public static void main(String args[])
	{
		CircleDemo c = new CircleDemo();
		c.accept();
		c.area();
		c.perimeter();
		c.display();
	}
}
