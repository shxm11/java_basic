class MyThread extends Thread
{
	String nm;
	MyThread(String nm)  // constructor
	{
		this.nm=nm;
	}
	public void run()  
	{
		System.out.println(nm);
	}
	public static void main(String a[])
	{
		MyThread t1= new MyThread("Hello Sham");
		MyThread t2= new MyThread("Hi Ram");
		
        t1.start();
        t2.start();
		
		t1.setName("1st Thread");
		t2.setName("2nd Thread");
		
		System.out.println(t1);
		
		t1.setPriority(10);
		System.out.println(t1);
	}
}