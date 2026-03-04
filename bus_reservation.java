import java.util.*;

class bus
{
	String p,d,seat,name,age;
	int m;
	Scanner sc=new Scanner(System.in);
	void dis()
	{
		System.out.println("Enter Pickup point");
		p=sc.next();
		System.out.println("Enter Drop point");
		d=sc.next();
	}
	void payment()
	{
		System.out.println("Enter Price");
		m=sc.nextInt();
	}
	void seat()
	{
		System.out.println("Enter Seat Preference");
		seat=sc.next();
	}
	void per()
	{
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Age");
		age=sc.next();
	}
	
	void display()
	{
		System.out.println("Name-"+name+"Age-"+age+"Pickup-"+p+"Drop Point"+d);
		System.out.println("seat preferance-"+seat+"Amount Paid-"+m);	
	}
	public static void main(String a[])
	{
		bus b=new bus();
		b.per();
		System.out.println("----------------");
		b.dis();
		System.out.println("----------------");
		b.seat();
		System.out.println("----------------");
		b.payment();
	}
}