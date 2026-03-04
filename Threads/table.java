class MyTable extends Thread
{
	int n;
	MyTable(int n)
	{
		this.n=n;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i*n);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception ob){}
		}		
	}
	public static void main(String a[])throws Exception
	{
		MyTable t1= new MyTable(2);
		MyTable t2= new MyTable(100);
		t1.start();
		t2.start();
	}
}