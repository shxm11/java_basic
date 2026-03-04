import SY.symarks;
import TY.tymarks;
import java.util.*;

class student
{
	static Scanner sc=new Scanner(System.in);
	int rn;
	String nm;
	student()
	{
		System.out.print("Enter Student Roll No: ");
		rn=sc.nextInt();
		System.out.print("");
		System.out.print("Enter Student Name: ");
		nm=sc.next();
		System.out.print("");
		System.out.print("-----------------------------");
		System.out.println("");
	}
	public static void main(String a[])
	{
		System.out.print("Enter how many Students: ");
		int n=sc.nextInt();
		System.out.print("");
		student s[]=new student[n];
		symarks sy[]=new symarks[n];
		tymarks ty[]=new tymarks[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new student();
			sy[i]=new symarks();
			ty[i]=new tymarks();
			System.out.println("^^^^^^^^^^^^");
			System.out.println("||||||||||||");
		}
		for(int i=0;i<n;i++)
		{
			int total=sy[i].comp+sy[i].ele+sy[i].math+ty[i].t+ty[i].p;
			System.out.println("");
			System.out.println("Roll No= "+s[i].rn+"  Name= "+s[i].nm);
			System.out.println("Student Total Marks: "+total);
			float per=total/5.0f;
			if(per>=80)
			{
				System.out.println("A Grade");
				System.out.println("*********************");
			}
			else if(per>=60 && per<80)
			{
				System.out.println("B Grade");
				System.out.println("*********************");
			}
			else if(per>=40 && per<60)
			{
				System.out.println("C Grade");
				System.out.println("*********************");
			}
			else if(per==35 && per<40)
			{
				System.out.println("Pass");
				System.out.println("*********************");
			}
			else
			{
				System.out.println("Fail");
				System.out.println("*********************");
			}
		}
	}
}