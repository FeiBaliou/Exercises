/* Exercise 6 
   Write a Java program to convert seconds to hour, minute and seconds.  */


import java.util.Scanner;

public class ConvertSeconds {

public static void main(String [] args ) { 

Scanner in = new Scanner(System.in);

System.out.println("Enter seconds: ");
long sec = in.nextLong();
convertSecToHour(in, sec);

}

public static void convertSecToHour (Scanner in,Long sec){
double hours = sec/3600 ;
double minutes = (sec % 3600) / 60 ;
double seconds = ( (sec % 3600) % 60 ) % 60 ;
System.out.println(sec + " seconds:  "  + hours + " hours, " + minutes + " minutes, " + seconds + " seconds "  );

}

}