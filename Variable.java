public class Variable{

   						 // name is instance variable 
   public String name;

  						 // salary  variable is static varaiable
   private static double salary;

  
   public Variable(String empName) {
      name = empName;
   }

   public void printEmp() {
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }

   public static void main(String args[]) {
      Variable empOne = new Variable("Ransika");
      salary=1000;
      empOne.printEmp();
   }
}
