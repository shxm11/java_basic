import java.util.*; 
class demo
{
	void area(int h, int b)
	{
		System.out.println("The area of triangle is "+(0.5*h*b));
	}
	void area(int r)
	{
		System.out.println("The area of Circle is "+(3.14*r*r));
	}
	void area(float l, float b)
	{
		System.out.println("The area of Rectangle is "+(l*b));
	}
	
	public static void main(String a[])
	{
		demo d=new demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height and Base for Triangle");
		int h= sc.nextInt();
		int b= sc.nextInt();
		d.area(h,b);
		System.out.println("--------------------------------------");
		System.out.println("Enter Length and Breadth for Rectangle");
		float j= sc.nextFloat();
		float c= sc.nextFloat();
		d.area(j,c);
		System.out.println("--------------------------------------");
		System.out.println("Enter Radius for Circle");
		int r= sc.nextInt();
		d.area(r);
	}
}