/*Exercise 1
Create a program that contains a String that holds your favorite movie quote and display the total number of
spaces contained in the String. Then modify the application so that the quote is entered by the user. */


import java.util.Scanner;
public class NumOfSpacesString {

public static void main (String [] args) {

Scanner in = new Scanner(System.in);
System.out.println("Enter your favorite movie quote: ");
String quote = in.nextLine();

int count = 0;
for(int i = 0; i < quote.length(); i++)
{    
   if(quote.charAt(i) == ' ')    
      count++;    
     }    

System.out.println("The number of spaces in this quote is: " + count);


}

}