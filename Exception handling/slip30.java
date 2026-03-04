import java.util.*;
class iszero extends Exception
{
	
}
class palindrome
{
	int n;
	palindrome(int n)
	{
		this.n=n;
	}
    void check()
	{
		int temp,r;
	    int sum=0;
		temp=n;    
        while(n>0)
		{
			r=n%10;  //getting remainder  
            sum=(sum*10)+r;    
            n=n/10;  
		}			    
        if(temp==sum) 			
               System.out.println("palindrome number ");    
        else    
               System.out.println("not palindrome");    
    } 
}
class check
{
	public static void main (String a[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		try
		{
			if(n==0)
				throw new iszero(); 
			else
			{
				palindrome ob=new palindrome(n);
				ob.check();
			}	
			
		}
		catch(iszero ob)
		{
			System.out.println("Number is Zero: ");
		}
		catch(InputMismatchException ob)
		{
			System.out.println("Enter Numeric Value Only: ");
		}
	}
}
