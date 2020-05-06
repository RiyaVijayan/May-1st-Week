/* Types of variables - local variable  */

public class Local_var{
   public void pupAge() {
      int age = 0;		//age is local variable within a method
      age = age + 7;
      System.out.println("Puppy age is : " + age);
   }

   public static void main(String args[]) {
      Local_var test = new Local_var();
      test.pupAge();
   }
}
