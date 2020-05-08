//Java Program to demonstrate class - main in another class 

class Employee
{  
	int id;  
	String name;  
}  
					//Creating another class which contains the main method  
class Class_2
{  
	public static void main(String args[])
	{  
		Employee e1=new Employee();  
		System.out.println(e1.id);  
		System.out.println(e1.name);  
	}  
}  
