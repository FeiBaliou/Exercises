//1. length()
     //Create a method that accepts 2 strings. Check which is the largest and print a message informing the user.
    
public class LengthMethod {


   public static void main(String[] args) {
     
       checkLength("Hello","Good Morning");
       System.out.println(printAmessage("Katerina"));
 }


 public static void checkLength(String word1,String word2){
           String checkLength = word1.length()>word2.length() ?  word1 + " is bigger than " + word2 + "!" : word2 + " is bigger than " + word1 + "!" ;
           System.out.println(checkLength);
            }

 //Create a method that accepts a name and returns a message based on length. More than 5 letters is a big name else small name. Use ternary.
     public static String printAmessage(String name){
         String checkName = (name.length()>5) ? name +" is Big name!" : name +" is Small name!";
         return checkName;
      }


}