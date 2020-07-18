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
public class Circle extends Shape{
    protected int radius;

   

    public Circle(String color,Size size,int radius) {
        super(color,size);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    
    
    @Override
   public double getPerimeter() {
      double  perimeter =  2*radius* Math.PI ;
        return perimeter;
    }
    
    
    @Override
     public double getArea(){
         double area = radius*radius*Math.PI;
         return area;
          
    }
     
    @Override
    public void printShape(){
           System.out.println("Printing a " + super.getSize() + " size, color " + super.getColor() +  ",shape Circle.");
    }
    
    
   
    @Override
    public String toString() {
        return "Circle{" + "size=" + super.getSize() + " color=" + super.getColor() + " radius=" + radius +  '}';
    }

   
}
