import java.time.Year;

public class CalculateAges {

   
public static void main(String[] args){
      
int year = Year.now().getValue();
int yearFuture = 2040;
int yearPast = 1960;
int myAge = 30;
int firstAge = 65;
int secondAge = 80;
int thirdAge = 25;
     
int myBornYear = year - myAge;
int firstBornYear = year - firstAge;
int secondBornYear = year - secondAge;
int thirdBornYear = year - thirdAge;
     
     
     
System.out.println("I was born in " + (year - myAge) + ".");
        
System.out.println("The first person was born in " + firstBornYear + ".");

System.out.println("The second person was born in " + secondBornYear + ".");
        
System.out.println("The third person was born in " + thirdBornYear + ".");

     if (yearPast - myBornYear >0) {

     System.out.println("In " + yearPast  +  " I was " + (yearPast - myBornYear) + " and in " + yearFuture + " I will be " + (yearFuture - myBornYear) + ".");
         }
      else {
           System.out.println("I had not been born in " + yearPast + " and in " + yearFuture + " I will be " + (yearFuture - firstBornYear) + ".");
           }



     if (yearPast - firstBornYear>0){
        System.out.println("The first person in " + yearPast  +  " was " + (yearPast - firstBornYear) + " and in " + yearFuture + " will be " + (yearFuture - firstBornYear) + ".");
         }
        else {
            System.out.println("The first person had not been born in " + yearPast + " and in " + yearFuture + " will be " + (yearFuture - firstBornYear) + ".");
             }
        
    if (yearPast - secondBornYear>0) {
       System.out.println("The second person in " + yearPast  +  " was " + (yearPast - secondBornYear) + " and in " + yearFuture + " will be " + (yearFuture - secondBornYear) + ".");
     } else {
           System.out.println("The second person had not been born " + yearPast + " and in " + yearFuture + " will be " + (yearFuture - secondBornYear));
            }
    if (yearPast - thirdBornYear>0){
       System.out.println("The third person in " + yearPast  +  " was " + (yearPast - thirdBornYear) + " and in " + yearFuture + " will be " + (yearFuture - thirdBornYear) + ".");

    } else { 
           System.out.println("The third person had not been born " + yearPast + " and in " + yearFuture + " will be " + (yearFuture - thirdBornYear) + ".");
        }
}
}    
