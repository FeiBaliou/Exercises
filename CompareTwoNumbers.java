/* Exercise 4.
   Create a program that accepts 2 numbers. You cannot use Scanner class. The program will print a message for each relational operator 
   (>, <, >=, <=, ==, !=).
	a.First a message will be printed with the numbers that were entered like below:
	b.Numbers entered : 2, 6.
	c.Each relational operator will have its own message.
	d.For example (Relational operator ==):
	    Is 2 equal to 6: true/false       */


public class CompareTwoNumbers{

public static void main(String[] args) { 

String givenNumbers = args[1];

int number1 = Integer.parseInt(args[0]);
int number2= Integer.parseInt(args[1]);

System.out.println("Numbers entered : " + number1  + "," + number2 + "." );
System.out.println("Is " + number1 + " greater than " + number2 + "? : " + (number1>number2) );
System.out.println("Is " + number1 + " less than " + number2 + "? : " + (number1<number2) );
System.out.println("Is " + number1 + " greater than or equal to " + number2 + "? : " + (number1>=number2) );
System.out.println("Is " + number1 + " less than or equal to " + number2 + "? : " + (number1<=number2) );
System.out.println("Is " + number1 + " equal to " + number2 + "? : " + (number1 == number2) );
System.out.println("Is " + number1 + " not equal to " + number2 + "? : " + (number1 != number2) );

}
}