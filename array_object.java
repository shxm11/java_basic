import java.util.*;

class teacher
{
	int tid, sal;
	String tname, desg, sub;
	Scanner sc=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter Teacher Id: ");
		tid=sc.nextInt();
		System.out.println("Enter Teacher Name: ");
		tname=sc.next();
		System.out.println("Enter Teacher Salary: ");
		sal=sc.nextInt();
		System.out.println("Enter Teacher Designation: ");
	    desg=sc.next();
		System.out.println("Enter Teacher Subject: ");
		sub=sc.next();
	}
	void display()
	{
		System.out.println("ID: "+tid+"  Name: "+tname+"  Salary: "+sal);
		System.out.println("Designation: "+desg+"  Subject: "+sub);
		System.out.println("-----------------------------------------------------");
	}
	
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of Entries: ");
		int n= sc.nextInt();
		teacher t[]= new teacher[n];
		
		for(int i=0;i<n;i++)
		{
			t[i]=new teacher();
			t[i].accept();
		}
		for(int i=0;i<n;i++)
		{
			t[i].display();
		}
	}
}
