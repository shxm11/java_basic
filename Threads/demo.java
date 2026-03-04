class demo extends Thread
{
	public void run()
	{
		System.out.println("In thread run");
	}
	public static void main(String a[])
	{
		demo t1= new demo();
		t1.start();
	}
}