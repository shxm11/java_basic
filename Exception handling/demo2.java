import java.util.*;
class demo{
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		int n1;
		String=n2;
		System.out.println("Enter Two numbers: ");
		n1=sc.nextInt();
		n2=sc.next();
		try{
		System.out.println("Add: "+(n1+n2));
		System.out.println("Sub: "+(n1-n2));
		System.out.println("Multi: "+(n1*n2));
		System.out.println("Divison: "+(n1/n2));
		System.out.println("Mod: "+(n1%n2));
		}
		catch(InputMismatchException ob)
		{
			System.out.println("Only Interger values can be accepted");
		}
	}
}