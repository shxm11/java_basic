import java.io.*;
class demo
{
	public static void main(String a[]) throws IOException
	{
		int n;
		String nm;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name: ");
		nm=br.readLine();
		System.out.println("Enter age: ");
		n=Integer.parseInt(br.readLine());
		System.out.println("Name: "+nm+"Age: "+n);
	}
}