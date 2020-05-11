//Java Program to show the usage of private attributes within a class

public class Private
{
	private String fname = "John";
	private String lname = "Abraham";
	private String email = "john@Abraham.com";
	private int age = 24;

	public static void main(String[] args) 

	{
		Private myObj = new Private();
		System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		System.out.println("Email: " + myObj.email);
		System.out.println("Age: " + myObj.age);
	}
}


