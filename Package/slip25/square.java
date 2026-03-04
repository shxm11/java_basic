package series;

public class square
{
	public square(int n)
	{
		System.out.println(" ");
		System.out.println("Square of Series: ");
		for(int i=1;i<=n;i++)
		{
			int ans=i*i;
			System.out.print(ans+" ");
		}
		System.out.println(" ");
		System.out.println("---------------------------------");
	}
}