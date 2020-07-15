// 2. charAt()
      // Create a method that accepts an array of names. Print only the names that start with letter J.



public class CharAtMethod {

    
    public static void main(String[] args) {
        
        String [] names = {"Mary","Fei","Jane","Jonathan","Joanna"};     
        
        ArrayNamesStartingFromJ(names,'J');     
}

     public static void ArrayNamesStartingFromJ(String[] names, char letter){
         System.out.println("Names starting with \'J\': ");
         for (int i = 0; i <names.length; i++) {
               if (names[i].charAt(0)== letter ){
                  System.out.println(names[i]);
             }
          }
     }

}
      