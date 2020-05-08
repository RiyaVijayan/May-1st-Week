// Java Program to illustrate the Class with constructor Initializtion

class Employee
{  
	int id;  
	String name;  
	float salary;
 
	Employee(int i, String n, float s) 		//constructor
	{  
		id=i;  
		name=n;  
		salary=s;  
	}  
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}  
}
  
public class Class_4 
{  
	public static void main(String[] args) 
	{  
		Employee e1=new Employee( 101,"Riya",45000);  
		Employee e2=new Employee(102,"Subi",25000);  
		Employee e3=new Employee(103,"Rinsi",55000);    


		e1.display();  
		e2.display();  
		e3.display();  
	}  
}  
