package program1;

import java.util.*;
public class Fibo{
    void fibonacci(int n){
        int first = 0;
        int second = 1; 
        System.out.println(first);
        System.out.println(second);
        n-=2;
        for(int i=0;i<n;i++){   
            int third = first + second;
            System.out.println(third);
            first=second;
            second=third;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibo fib = new Fibo();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("The series is");
        fib.fibonacci(n);
        sc.close();
    }
}