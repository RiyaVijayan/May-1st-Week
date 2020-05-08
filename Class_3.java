//Java Program to demonstrate a Class filed initialization through methods

class  Tree 
{  
	int age;  
	String name;  
	void insertRecord(int a, String n)
	{  
		age = a;  
		name = n;  
	}  
	void displayInfo()
	{
		System.out.println(age +" "+ name);
	}  
}  
class Class_3
{  
	public static void main(String args[])
	{  
		Tree t1=new Tree();  
		Tree t2=new Tree();  
		t1.insertRecord(111,"Bamboo Tree ");  
		t2.insertRecord(222,"Banyan Tree ");  
		t1.displayInfo();  
		t2.displayInfo();  
	}  
}  
