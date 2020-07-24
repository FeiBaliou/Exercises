/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BunnyMap;


public class Bunny {
    private  int bunnyNumber;

    public Bunny() {
    }

    public Bunny(int bunnyNumber) {
        this();
        this.bunnyNumber = bunnyNumber;
    }

    public int getBunnyNumber() {
        return bunnyNumber;
    }

    public void setBunnyNumber(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    
    
    public  String  hop() {
        String msg =("bunny " + this.bunnyNumber+ " it’s hopping");
        return msg;
    
    }
    
    
    @Override
    public String toString() {
        return "Bunny{" + "bunnyNumber=" + bunnyNumber + '}';
    }
    
    
    
    
}
