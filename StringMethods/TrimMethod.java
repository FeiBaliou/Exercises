//      6. trim()
//    Create a method that accepts a string and trims it. Use it with input text.
     
import java.util.Scanner;

public class TrimMethod {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println(trim(in));
        
}
   
   
    public static String trim(Scanner in){
      System.out.println("Enter a Sentence. Hit Tab key Before and After:");
      String input = in.nextLine();
      String trim= input.trim();
      return trim;
   
  }

}