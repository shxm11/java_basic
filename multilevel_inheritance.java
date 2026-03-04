import java.util.*;
class student
{
	String name;
	int id;
	Scanner sc=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter Name: ");
		id=sc.nextInt();
		System.out.println("Enter ID: ");
		name=sc.next();
	}
}
class marks extends student
{
	int m1,m2,m3,m4;
	Scanner sc=new Scanner(System.in);
	void accept()
	{
		super.accept();
		System.out.println("Enter Marks of- ");
		System.out.print("English: ");
		m1=sc.nextInt();
		System.out.print(" Maths: ");
		m2=sc.nextInt();
		System.out.print(" History: ");
		m3=sc.nextInt();
		System.out.print(" Science: ");
		m4=sc.nextInt();
	}
}
class result extends marks
{
	int tot;
	float per;
	void cal()
	{
		tot=m1+m2+m3+m4;
		per=(tot/400)*100;
		System.out.println("ID: "+id+"  Name: "+name);
		System.out.println("Total Marks: "+tot+"  Percantage Scored: "+per);
	}
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Students: ");
		int n=sc.nextInt();
		result r[]=new result[n];
		
		for(int i=0;i<n;i++)
		{
			r[i]=new result();
			r[i].accept();
		}
		for(int i=0;i<n;i++)
		{
			r[i]=new result();
			r[i].cal();
		}
	}
}