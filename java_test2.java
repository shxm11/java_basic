import java.io.*;
class person
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int age;
	String name;
	void accept()throws IOException
	{
		System.out.println("Enter Name: ");
		name=br.readLine();
		System.out.println("Enter Age: ");
		age=Integer.parseInt(br.readLine());
	}
	void display()
	{
		System.out.println("Name: "+name+"Age: "+age);
	}
}
class student extends person
{
	private int marks;
	void getter()throws IOException
	{
		System.out.println("Enter Marks: ");
		marks=Integer.parseInt(br.readLine());
	}
	void setter()
	{
		System.out.println("Marks: "+marks);
	}
}
class teacher extends person
{
	private int salary;
	void getter()throws IOException
	{
		System.out.println("Enter Salary: ");
		salary=Integer.parseInt(br.readLine());
	}
	void setter()
	{
		System.out.println("Salary: "+salary);
	}
	public static void main(String a[])throws IOException
	{
		student s=new student();
		s.accept();
		s.getter();
		s.display();
		s.setter();
		System.out.println("----------------------------------");
		teacher t=new teacher();
		t.accept();
		t.getter();
		t.display();
		t.setter();
	}
}