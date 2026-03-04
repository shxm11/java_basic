import java.util.*;
import series.fibo;
import series.cube;
import series.square;

class number
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Range: ");
		int n=sc.nextInt();
		System.out.println(" ");
		fibo f=new fibo(n);
		cube c=new cube(n);
		square s=new square(n);
		
	}
}