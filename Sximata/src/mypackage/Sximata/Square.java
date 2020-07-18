/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.Sximata;

/**
 *
 * @author feiba
 */
public class Square extends Shape{
    private int side;

    
    public Square(String color,Size size,int side) {
        super(color,size);
        this.side = side;
    }

   
    public void setSide(int side) {
        this.side = side;
    }

     @Override
      public double getPerimeter(){
          double perimeter = 4*side;
          return perimeter;
    }
    
    
    @Override
     public double getArea(){
         double area = side*side;
         return area;
    }
     
    @Override
    public void printShape(){
           System.out.println("Printing a " + super.getSize() + " size, color " + super.getColor() +  ",shape Square.");
    }

    @Override
    public String toString() {
        return "Square{" + "size=" + super.getSize() + " color=" + super.getColor() + " side=" + side +  '}';
    }

         
}
