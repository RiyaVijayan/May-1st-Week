//Java Program to demonstrate Array

public class MyArray
 {
  public static void main(String[] args) 
{
    String[] place = {"Kollam", "Chennai", "Bangaluru", "Pune"};

    System.out.println("Array elements : ");

    for (int i = 0; i < place.length; i++) 
    	System.out.println(place[i]);

    place[0] = "Kochi";
    System.out.println(" First index changed to : " + place[0]);

    System.out.println("Modified Array elements : ");

    for (String i : place) 
  	System.out.println(i);

    System.out.println("Length of array "+ place.length);
  }
}


