//      8. replace()
//    Use replace to check for ", " in the previous exercise and replace it with "-"
      


public class ReplaceMethod {

    
    public static void main(String[] args) {
        
      Replace("Computer,Laptop,Tablet");

}


public static void Replace(String array){
          if(array.contains(",")){
            String replaced = array.replace(",", "-");
              System.out.println(replaced);
           
                    }
      
      }



}
          