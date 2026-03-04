class demo2 implements Runnable
{
	public void run()
	{
		System.out.println("In thread run");
	}
	public static void main(String a[])
	{
		demo2 t1= new demo2();
		Thread t= new Thread(t1);
		t.start();
	}
}