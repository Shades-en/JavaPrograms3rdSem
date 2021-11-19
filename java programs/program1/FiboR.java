package program1;

import java.util.*;

public class FiboR {
    void fibonacci (int n, int first, int second){
        int third = first + second;
        System.out.println(third);
        if(n>1){
            fibonacci(n-1,second,third);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FiboR fib = new FiboR();
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println("the series is");
        int first=0;
        int second=1;
        System.out.println(first);
        System.out.println(second);
        n-=2;
        fib.fibonacci(n,first,second);
        sc.close();
    }
}
