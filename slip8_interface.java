import java.util.*;
interface shape
{
	float pi=3.14f;
	void area();
}
class circle implements shape
{
	int r;
	circle(int r)
	{
		this.r=r;
	}
	public void area()
	{
		System.out.println("The area of circle is: "+(pi*r*r));
	}
}
class sphere implements shape
{
	int r;
	sphere(int r)
	{
		this.r=r;
	}
	public void area()
	{
		System.out.println("The area of sphere is: "+(4*pi*r*r));
	}
	
	public static void main(String a[])
	{
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		r=sc.nextInt();
		
		/*circle c=new circle(r);
		c.area();
		
		sphere s=new sphere(r);
		s.area();*/
		
		//using reference 
		shape sp;            // interface object created but no memory location alloted
		sp=new circle(r);    
		sp.area();
		
		sp=new sphere(r);
		sp.area();
	}
}

