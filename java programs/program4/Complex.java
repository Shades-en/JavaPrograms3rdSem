package program4;

import java.util.*;
public class Complex {
    int a;
    int b;

    public Complex(int a, int b){
        this.a=a;
        this.b=b;
    }

    Complex add(Complex comp2){
        return new Complex(a+comp2.a, b+comp2.b);
    }

    Complex sub(Complex comp2){
        return new Complex(a-comp2.a, b-comp2.b);
    }

    Complex mul(Complex comp2){
        int real=(a*comp2.a)-(b*comp2.b);
        int img=(a*comp2.b)+(b*comp2.a);
        return new Complex(real, img);

    }

    public String toString(){
        if(b>0) return a+" + i"+b;
        else return a+" - i"+Math.abs(b);
    }

    public static void main(String[] args) {
        Complex comp1 = new Complex(2, +3);
        System.out.println("num1 = "+comp1);
        Complex comp2 = new Complex(4, -3);
        System.out.println("num2 = "+comp2);

        System.out.println("Addition= "+comp1.add(comp2));
        System.out.println("Subtraction= "+comp1.sub(comp2));

        System.out.println("Multiplication= "+comp1.mul(comp2));

    }
}
