//     4. concat()
//    Create a method that accepts two names and returns their concatenation

//5. toLowerCase(), toUpperCase()
//    Update the previous method so that it prints the concatenation in Uppercase
      
public class ConcatMethod {

    
    public static void main(String[] args) {
     
     System.out.println(concatNames("Foteini+","Sofia"));

}

public static String concatNames(String nameA,String nameB) {
        nameA = nameA.concat(nameB).toUpperCase();
        return nameA;
      }

}