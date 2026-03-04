class Table 
{
	public static synchronized void getTable(int n)  //static synchronized 
	{
		for (int i=1;i<=5;i++)
		{
			try
			{
				System.out.println(n*i);
				Thread.sleep(500);
			}
			catch(Exception ob){}
		}
		System.out.println("-----------");
	}
	
}
class Sync1 extends Thread
{
	public void run()
	{
		Table.getTable(2);
	}
}
class Sync2 extends Thread
{
	public void run()
	{
		Table.getTable(50);
	}
}
class Sync3 extends Thread
{
	public void run()
	{
		Table.getTable(1000);
	}
}
class Sync4 extends Thread
{
	public void run()
	{
		Table.getTable(9);
	}
}
class mainThread 
{
	public static void main(String a[])
	{
		Sync1 t1=new Sync1();
		Sync2 t2=new Sync2();
		Sync3 t3=new Sync3();
		Sync4 t4=new Sync4();
		
		t3.setPriority(1);
		
		t1.setName("1st Thread");
		t2.setName("2nd Thread");
		t3.setName("3rd Thread");
		t4.setName("4th Thread");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}