//Java Program to demonstrate Anonymous Object creation and Method call

class Anonymous
{  
	void fact(int  n)
	{  
		int fact=1;  
		for(int i=1;i<=n;i++)
		{  
			fact=fact*i;  
		}  
		System.out.println("factorial is "+fact);  
	}  
	public static void main(String args[])
	{  
		new Anonymous().fact(5);	//calling method with anonymous object  
	}  
}  
