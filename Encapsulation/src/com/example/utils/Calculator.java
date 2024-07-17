package com.example.utils;

import com.example.geometry.Rectangle;
import com.example.geometry.Circle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10,5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.length * rect.breath;

        System.out.printf("Area of Circle : %f %n" , cirArea);
        System.out.printf("Area of Rectangle : %f", rectArea);
    }
}
