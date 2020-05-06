//Use of String object in Java

public class StringExamples
{
  public static void main(String[] args) 
{
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    String txt1 = "English Alphabets ";
    int num = 26; 
    String txt2 = txt1 + num;
    System.out.println("The length of the txt string is: " + txt.length()+ "\n" ); 
    System.out.println("In lowecase " + txt.toLowerCase() + "\n" );
    System.out.println("In uppercase " + txt.toUpperCase() + "\n" );   
    System.out.println("Location of \"KLM\" in the string " + txt.indexOf("KLM") + "\n" );
    System.out.println("Concatenation " + txt +" " +txt1 + "\n" );
    System.out.println("Concatenation using concat() " + txt.concat(txt1) + "\n");
    System.out.println("Number+String " + txt2);


}
}


