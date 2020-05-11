//JAVA program to initialize the constructor with this

class Me{  
	Me()
	{
		System.out.println("hello ....! ");
	}  
	Me(String x)
	{  
		this();  
		System.out.println(x);  
	}  
}  


class this_kw1
{  
	public static void main(String args[])
	{  
		Me m=new Me("LGSI ");  
	}
}  
