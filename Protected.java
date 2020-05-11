//Java program to show the usage of protected attributes

class Student 
{
  protected String fname = "Riya";
  protected String lname = "John";
  protected String email = "riya@John.com";
  protected int age = 32;
}

class Protected extends Student 
{
  private int graduationYear = 2019;
  public static void main(String[] args) 
{
    Protected myObj = new Protected();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
  }
}

