/* Exercise 7
   Explore Math class. Input a double number like 3.45. What is the result of ceil, floor, round, abs of Math class?
   What are the results of the above if number = -3.45?   
*/



import java.util.Scanner;

public class MathClassExercise {

public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.println("Input a number with two decimal places: " );
double number = in.nextDouble();
ceil(number);
floor(number);
round(number);
abs(number);


}

//Math.ceil returns the smallest double value that is greater than or equal to the argument
public static double ceil (Double number){
System.out.println("Math.ceil( " + number + " ) is: " + Math.ceil(number) );
return number;
}

//Math.floor returns the largest double value that is less than or equal to the argument
public static double floor (Double number){
System.out.println("Math.floor( " + number + " ) is: " + Math.floor(number) );
return number;
}

//Math.round returns the round value of a double value
public static double round (Double number){
System.out.println("Math.round( " + number + " ) is: " + Math.round(number) );
return number;

}

//Math.abs returns the absolute value of an int value
public static double abs (Double number){
System.out.println("Math.abs( " + number + " ) is: " + Math.abs(number) );
return number;

}



}




