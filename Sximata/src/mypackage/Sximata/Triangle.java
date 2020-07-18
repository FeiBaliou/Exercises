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
public class Triangle extends Shape{
    private int base;
    private int side2;
    private int side3;
    private int height;

  

    public Triangle(String color,Size size,int base, int side2, int side3, int height) {
        super(color,size);
        this.base = base;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

     @Override
     public double getPerimeter(){
          double perimeter = base + side2+side3;
          return perimeter;
    }
    
    
    @Override
     public double getArea(){
         double area = (base*height)/2;
          return area;
    }
     
    @Override
    public void printShape(){
           System.out.println("Printing a " + super.getSize() + " size, color " + super.getColor() +  ",shape Triangle.");
    }
    
    
    
    @Override
    public String toString() {
        return "Triangle{" + "size=" + super.getSize() + " color=" + super.getColor() + " base=" + base + " side2=" + side2 + " side3=" + side3 + " height=" + height + '}';
    }
    
    
    
    
    
    
}
