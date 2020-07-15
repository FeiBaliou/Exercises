//     3. indexOf()
//    Create a method that accepts an array of cities Athens, Thessaloniki, Thiva, Thasos, Xanthi, Kallithea, Rethymno. Print those that start from Th.

 
public class IndexOfMethod {

    
    public static void main(String[] args) {
        
         cities();

}

    public static void cities(){
          String [] cities = {"Athens", "Thessaloniki", "Thiva", "Thasos", "Xanthi", "Kallithea", "Rethymno"};
          System.out.println("Cities starting with \'Th\' : ");
          for(String city : cities){
          int index = city.indexOf("Th");
                   if (index == 0){
                       System.out.println(city); 
            }
         }
      }
     

}