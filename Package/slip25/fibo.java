package series;

public class fibo
{
	public fibo(int n)
	{
		System.out.println("Fibonacci Series: ");
		int a=0,b=1,c=0;//a b c 
		for (int i=1;i<=n;i++) // 0 1 1 2 3 5 8 13 21 34
		{                  //   a b c
			System.out.print(a+"  ");
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(" ");
		System.out.println("---------------------------------");
	}
}