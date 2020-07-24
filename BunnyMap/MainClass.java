
//Create a class called Bunny with an int bunnyNumber initialized in the constructor.
//Give it a method called hop() that prints out which gerbil number this is, and that it’s hopping.
//Create an ArrayList and add 5 Bunny objects to the List.
//Now use the get() method to move through the List and call hop() for each Bunny.
// Loop through the ArrayList using an Iterator
//Exercise 2
// Move the Bunny class from Exercise 1 into a Map, and associate each Bunny (the value) with it's name as a
//String (the key).
// Use an Iterator for the keySet() to move through the Map, look up the Bunny for each key, print out the key,
//and tell the Bunny to hop().


package BunnyMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class MainClass {

   
    public static void main(String[] args) {
        List<Bunny> bunny = new ArrayList();
        
        Bunny b1 = new Bunny(3);
        Bunny b2 = new Bunny(4);
        Bunny b3 = new Bunny(5);
        Bunny b4 = new Bunny(6);
        Bunny b5 = new Bunny(7);
        
        
        bunny.add(b1);
        bunny.add(b2);
        bunny.add(b3);
        bunny.add(b4);
        bunny.add(b5);
        for(Bunny b:bunny){
            System.out.println(b.hop() );
        }
        
        System.out.println("-----------------WITH GET------------------");
        //move through the List and call hop() for each Bunny
        for (int i = 0; i < bunny.size(); i++) {
            System.out.println(bunny.get(i).hop()); 
         }
         
       
       System.out.println("------------LOOP WITH ITERATOR--------------");
        
       Iterator<Bunny> itrBunny = bunny.iterator();
   
            while (itrBunny.hasNext()) {
                System.out.println(itrBunny.next().hop());
            }
     
   
        System.out.println("----Map with object Bunny and String names-"); 
         
        Map <String,Bunny> bunnies = new TreeMap<String,Bunny>();
            bunnies.put("Bunnie",b1);
            bunnies.put( "Coco",b2);
            bunnies.put("Vanilla",b3);
            bunnies.put("Bugs",b4);
            bunnies.put("Bella",b5);
            
           
            
            
//            for (Map.Entry<String, Bunny> entry : bunnies.entrySet()) {
//             System.out.println(entry.getKey() + "----->" + entry.getValue().hop());
//}
            
            
              Set<Map.Entry<String, Bunny>> entries = bunnies.entrySet();
              Iterator<Map.Entry<String, Bunny>> iterator = entries.iterator();
              Map.Entry<String, Bunny> entry;
              while(iterator.hasNext()){
              entry = iterator.next();
              System.out.println(entry.getKey() + "----->" + entry.getValue().hop());
             
            
  
    }

}
    

    
}
         
         
    
 
    

