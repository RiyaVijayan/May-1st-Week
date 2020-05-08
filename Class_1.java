//Java Program illustrating  class and fields - main in same class

class Class_1
{  

	int id;					//field 
	String name;
	void employe_show()			//method
	{
		System.out.println("Name : " + name + "\n" + "Employee id  : " + id ); 
	}

	public static void main(String args[])
	{  

		Class_1 e1=new Class_1();	//creating an object 

		e1.id = 2046 ;
		e1.name = "Riya ";
		e1.employe_show();

	}  
}  
