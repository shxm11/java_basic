import java.util.Random;

class GenerateRandom
{
	public static void main (String a[])
	{

		Random rn = new Random();
		
		for (int i=1;i<=100;i++)
		{
			int x = rn.nextInt(100);
		    System.out.println(x);
		}

    }
}