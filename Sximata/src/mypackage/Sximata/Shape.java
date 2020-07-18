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
public class Shape {
    private String color;
    private Size size;
    private double perimeter;
    private double area;



    public Shape(String color, Size size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

   
   public double getPerimeter() {
       return perimeter;

    }
    
    
     public double getArea(){
           return area;
    }
     
     
    public void printShape(){
          System.out.println("Printing a " + size + "," + color +  "," + "Shape");
    }
  
    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", sizes=" + size +'}';
    }
    
    
    
}
