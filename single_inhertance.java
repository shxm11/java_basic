import java.util.*;
class customer 
{
	int cid, bal;
	String cname;
	Scanner s=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter Customer ID: ");
		cid=s.nextInt();
		System.out.println("Enter Customer Name: ");
		cname=s.next();
		System.out.println("Enter Balance: ");
		bal=s.nextInt();
	}
}

class account extends customer
{
	float rate, tbal;
	Scanner s=new Scanner(System.in);
	void cal()
	{
		System.out.println("Enter Interest Rate: ");
		rate=s.nextFloat();
		
		tbal=bal+(bal*(rate/100));
	}
	void display()
	{
		System.out.println("cid: "+cid+" cname: "+cname);
		System.out.println("Bal: "+bal+" Balance with Interest: "+"*"+tbal+"*");
	}
	public static void main(String a[])
	{
		account ac=new account();
		ac.accept();
		ac.cal();
		ac.display();
	}
}