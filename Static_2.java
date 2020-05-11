//Java Program to demonstrate the use of a static method.  
class Student
{  
     int rollno;  
     String name;  
     static String college = "TKM";  
      
     static void change()
{  
     college = "CEA";  
     }  
       
     Student(int r, String n)
{  
     rollno = r;  
     name = n;  
     }  
       
     void display()
{
System.out.println(rollno+" "+name+" "+college);
}  
}  
  
public class Static_2
{  
    public static void main(String args[])
{  
    Student.change();  
      
    Student s1 = new Student(5,"Katharin Benson");  
    Student s2 = new Student(10,"Meenu Thomas");  
    Student s3 = new Student(19,"Riya Vijayan");  
      
    s1.display();  
    s2.display();  
    s3.display();  
    }  
} 
