//Program Showing Method Overloading in Java
public class MethodOverloading 
{
	static int Addition (int x, int y) 
	{
		return x + y;
	}

	static double Addition (double x, double y) 
	{
		return x + y;
	}

	public static void main(String[] args)
	 {
		int myNum1 = Addition(8, 5);
		double myNum2 = Addition(4.3, 6.26);
		System.out.println("Addition of integers: " + myNum1);
		System.out.println("Addition of double: " + myNum2);
	}
}

