class Table 
{
	public synchronized void getTable(int n)  //synchronized method
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
	}
	
}
class Sync1 extends Thread
{
	Table t;
	Sync1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.getTable(2);
	}
}

class Sync2 extends Thread
{
	Table t;
	Sync2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.getTable(100);
	}
}

class ThreadSync 
{
	public static void main(String ar[])throws Exception
	{
		Table ob = new Table();
		
		Sync1 t1=new Sync1(ob);
		Sync2 t2=new Sync2(ob);
		
		t1.start();
		t2.start();
	}
}