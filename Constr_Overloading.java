//Java program to overload constructors  
class Constr_Overloading
{  
	int id;  
	String name;  
	int age;  
						//creating two arg constructor  
	Constr_Overloading(int i,String n)
	{  
		id = i;  
		name = n;  
	}  
						//creating three arg constructor  
	Constr_Overloading(int i,String n,int a)
	{  
		id = i;  
		name = n;  
		age=a;  
	}  
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}  

	public static void main(String args[])
	{  
		Constr_Overloading c1 = new Constr_Overloading(101,"LGSI");  
		Constr_Overloading c2 = new Constr_Overloading(202,"LGSI Bangaluru",2026);  
		c1.display();  
		c2.display();  
	}  
}  
