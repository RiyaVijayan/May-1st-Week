//Java program demonstrating final class


final class Vehicle 
{
	protected String brand = "Ford";
	public void ride() 
	{
		System.out.println("Awesome!");
	}
}

class final_1 extends Vehicle       //error: cannot inherit from final class
{
	private String modelName = "Mustang";
	public static void main(String[] args) {
		final_1 my = new final_1();
		my.ride();
		System.out.println(my.brand + " " + my.modelName);
	}
}


