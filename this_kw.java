//JAVA program to demonstrate this keyword in constructors
class House
{  
	int houseno;  
	String name;  
	String place;  

	House(int houseno,String name,String place)
	{  
		this.houseno=houseno;  
		this.name=name;  
		this.place=place;  
	}  
	void display()
	{
		System.out.println(houseno+" "+name+" "+place);
	}  
}  

class this_kw
{  
	public static void main(String args[])
	{  
		House h1=new House(421,"Tony Vilasam","Thevalakkara");  
		House h2=new House(112,"Assisi House","Koivila");  
		h1.display();  
		h2.display();  
	}
}
