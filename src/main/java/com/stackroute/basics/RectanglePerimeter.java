package com.stackroute.basics;
import java.util.*;


public class RectanglePerimeter {
    public static void main(String[] args) {
    	new RectanglePerimeter().getValues();
        
    }

    //get user input from console
    public void getValues() {
    Scanner value = new Scanner(System.in);
    double length=value.nextDouble();
    double breath=value.nextDouble();
    System.out.println(perimeterCalculator(length, breath));
    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
        return 2*(length+breadth);
    }
   
}
