import java.util.Scanner;
import java.lang.Math;
class book{
	int bookid,no_of_pages,year_of_pub;
	String booktitle,author,publisher;
	float price;
	void getDetails()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter book id : ");
		bookid=scr.nextInt();
		System.out.println("Enter book title : ");
		booktitle=scr.next();
		System.out.println("Enter name of author : ");
		author = scr.next();
		System.out.println("Enter name of publisher : ");
		publisher = scr.next();
		System.out.println("Enter number of pages : ");
		no_of_pages = scr.nextInt();
		System.out.println("Enter year of publication : ");
		year_of_pub=scr.nextInt();
		System.out.println("Enter price : ");
		price = scr.nextFloat();
	}
	
	void display()
	{
		System.out.println("\nDetails : \nBook ID :  "+bookid+"\nTitle : "+booktitle+"\nAuthor : "+author+"\nPublisher : "+publisher+"\nNumber of pages : "+no_of_pages+"\nyear of publication : "+year_of_pub+"\nPrice : "+price);
	}
	
	void author(book b1,book b2)
	{
		String a;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter author name(for search) : ");
		a=scr.next();
		if(a.equals(author))
		display();
		
		if(a.equals(b1.author))
		b1.display();
		
		if(a.equals(b2.author))
		b2.display();
	}

	void expensive(book b1,book b2)
	{
		if(price>=b1.price&&price>=b2.price)
		System.out.println("The most expensive book is : "+booktitle);
		else if(b1.price>price&&b1.price>=b2.price)
		System.out.println("The most expensive book is : "+b1.booktitle);
		else if(b2.price>b1.price&&b2.price>b1.price)
		System.out.println("The most expensive book is : "+b2.booktitle);
	}
	
	void pdate(book b1,book b2)
	{
		System.out.println("\nBooks published in 2020 : ");
		if(year_of_pub==2020)
		System.out.println(booktitle);
		if(b1.year_of_pub==2020)
		System.out.println(b1.booktitle);
		if(b2.year_of_pub==2020)
		System.out.println(b2.booktitle);
		
	}
	
	void minpages(book b1,book b2)
	{
		if(no_of_pages<=b1.no_of_pages&&no_of_pages<=b2.no_of_pages)
		display();
		else if(b1.no_of_pages<=no_of_pages&&b1.no_of_pages<=b2.no_of_pages)
		b1.display();
		else if(b2.no_of_pages<=no_of_pages&&b2.no_of_pages<=b2.no_of_pages)
		b2.display();
	}
}
public class bookm {
	public static void main(String args[])
	{
		book b1 = new book();
		book b2 = new book();
		book b3 = new book();
		b1.getDetails();
		b2.getDetails();
		b3.getDetails();
		b1.author(b2, b3);
		b1.expensive(b2, b3);
		b1.pdate(b2,b3);
		b1.minpages(b2,b3);
	}
}
