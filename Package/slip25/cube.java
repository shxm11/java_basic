package series;

public class cube
{
	public cube(int n)
	{
		System.out.println(" ");
		System.out.println("Cube of Series: ");
		for(int i=1;i<=n;i++)
		{
			int ans=i*i*i;
			System.out.print(ans+" ");
		}
		System.out.println(" ");
		System.out.println("---------------------------------");
	}
}