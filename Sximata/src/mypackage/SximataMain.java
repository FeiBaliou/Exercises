/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import mypackage.Sximata.Circle;
import mypackage.Sximata.Shape;
import mypackage.Sximata.Size;
import mypackage.Sximata.Square;
import mypackage.Sximata.Triangle;

/**
 *
 * @author feiba
 */
public class SximataMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     //Shape s = new Shape("Blue",Size.MEDIUM);
        
      
      //Creation of objects for each Shape
      Shape s1 = new Square("Blue",Size.MEDIUM,3);
      Shape c1 = new Circle("RED",Size.SMALL,1);
      Shape t1 = new Triangle("GREEN",Size.LARGE,4,4,5,3);
      Shape s2 = new Square("PURPLE",Size.SMALL,1);
      Shape s3 = new Square("GREEN",Size.LARGE,7);
      
      
     //Creation of a List of Objects s1,t1,c1 
     List<Shape> shape = new ArrayList();
     shape.add(s1);
     shape.add(t1);
     shape.add(c1);
     //Call printShape for each element.
     for(Shape shapes:shape) {
         shapes.printShape();
         
        }
     
          
     System.out.println("-------------------------------------");           
     System.out.println("**********LARGEST PERIMETER**********");
           
     //Creation of a Hushtable which contains Objects and perimeter for each object. 
     Hashtable<Object, Double> maxPerimeter = new Hashtable<Object, Double>();
          maxPerimeter.put(s1, s1.getPerimeter());
          maxPerimeter.put(t1, t1.getPerimeter());
          maxPerimeter.put(c1, c1.getPerimeter());

          //Creation of a collection which give us which element has the largest perimeter
          Collection<Double> valuesPerimeter = maxPerimeter.values();
          Double maxValue = Collections.max(valuesPerimeter);
          Enumeration<Object> keys = maxPerimeter.keys();
          while(keys.hasMoreElements()){
              Object key = keys.nextElement();
              if((maxPerimeter.get(key)).equals(maxValue))
                 System.out.println("The shape with the largest perimeter is: " + "\n" + key);
          }
                
          
         System.out.println("--------------------------------");
         System.out.println("**********LARGEST AREA**********");
         
         //Creation of a Hushtable which contains Objects and Area for each object. 
          Hashtable<Object, Double> maxArea = new Hashtable<Object, Double>();
            maxArea.put(s1,s1.getArea());
            maxArea.put(t1,t1.getArea());
            maxArea.put(c1,c1.getArea());
            
            Collection<Double> valuesArea = maxArea.values();
            Double maxValue2 = Collections.max(valuesArea);
            Enumeration<Object>keys2 = maxArea.keys();
            while(keys2.hasMoreElements()) {
            Object key2 = keys2.nextElement();
            if ( (maxArea.get(key2)).equals(maxValue2))
                    System.out.println("The shape with the largest area is:" + "\n" + key2);
               }
            
          
           System.out.println("-----------------------------------");
           System.out.println("****LARGEST PERIMETER FOR SQUARES****");
            
         //Creation of a Hushtable which contains Squares and perimeter for each square. 
         Hashtable<Object, Double> maxPerimeterSquare = new Hashtable<Object, Double>();
           maxPerimeterSquare.put(s1, s1.getPerimeter());
           maxPerimeterSquare.put(s2, s2.getPerimeter());
           maxPerimeterSquare.put(s3, s3.getPerimeter());

          
          Collection<Double> valuesPerimeterSquare = maxPerimeterSquare.values();
          Double maxValue3 = Collections.max(valuesPerimeterSquare);
          Enumeration<Object> keys3 = maxPerimeterSquare.keys();
          while(keys3.hasMoreElements()){
              Object key3 = keys3.nextElement();
              if((maxPerimeterSquare.get(key3)).equals(maxValue3))
                 System.out.println("The square with the largest perimeter is: " + "\n" + key3);
              }

                
    
                   }
     
                       }
    

