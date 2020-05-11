//Java program to initialize the values from one object to another object.  
class copy_constr
{  
	int model;  
	String name;  
	copy_constr(int i,String n)//constructor to initialize integer and string 
	{  
		model = i;  
		name = n;  
	}  
	copy_constr(copy_constr c)
	{  
		model = c.model;  
		name =c.name;  
	}  
	void display()
	{
		System.out.println(model+" "+name);
	}  

	public static void main(String args[])
	{  
		copy_constr c1 = new copy_constr(2015,"Fz200");  
		copy_constr c2 = new copy_constr(c1);  
		c1.display();  
		c2.display();  
	}  
}  
