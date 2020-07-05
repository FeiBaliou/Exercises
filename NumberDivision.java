/*Exercise 3: 
  Check if a number can be divided by 3. Input the number by using the args array of the main method. */

public class NumberDivision { 

public static void main(String[] args) {

String givenNumber = args[0];

long number=Long.parseLong(givenNumber);  

if(number % 3 == 0) {
         System.out.println(number + " is divisible by 3");
      } else {
         System.out.println(number + " is not divisible by 3");
      }

}

}