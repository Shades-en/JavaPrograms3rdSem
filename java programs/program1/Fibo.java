package program1;

import java.util.Scanner;

public class fibo {
    int fibonacci(int n){
        if(n<=1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibo fib= new fibo();
        System.out.println("Enter the number of fibonacci series");
        int n= sc.nextInt();
        System.out.println("The series is in recursion is");
        for(int i=0;i<n;i++)
            System.out.print(fib.fibonacci(i)+"\t"); 
        System.out.println();
        System.out.println("Through loop is");
        int i=0;
        int num1=0;
        int num2=1;
        while(i<n){
            System.out.print(num1+"\t");
            int num3=num1+num2;
            num1=num2;
            num2=num3;
            i++;
        }
    }
}
