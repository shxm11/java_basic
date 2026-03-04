import java.io.*;
class demo{
	public static void main(String a[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n1,n2;
		System.out.println("Enter Two numbers: ");
		n1=Integer.parseInt(br.readLine());
		n2=Integer.parseInt(br.readLine());
		
		System.out.println("Add: "+(n1+n2));
		System.out.println("Sub: "+(n1-n2));
		try{
		System.out.println("Divison: "+(n1/n2));
		System.out.println("Mod: "+(n1%n2));
		}
		catch(ArithmeticException ob)
		{
			System.out.println("'0' cant be divided");
		}
		System.out.println("Multi: "+(n1*n2));
	}
}