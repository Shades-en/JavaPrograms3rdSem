package program8;

import java.util.*;

public class circleDriver{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        float radius= sc.nextFloat();
        Circle circle= new Circle(radius);
        System.out.println("Enter radians");
        float radians= sc.nextFloat();
        Sector sector= new Sector(radius, radians);
        System.out.println("Enter length");
        float length= sc.nextFloat();
        Segment segment= new Segment(radius, length);
        System.out.println("Area of a circle= "+ circle.circleArea());
        System.out.println("Area of a sector= "+ sector.sectorArea());
        System.out.println("Area of a segment= "+ segment.segmentArea());
        sc.close();
    }
    }