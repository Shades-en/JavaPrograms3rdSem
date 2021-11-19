package program1;

import java.util.*;

public class Prime{
    void primeNo(int n){
        int flag=0;
        for(int i=2;i<n;i++){
            if(i!=n){
                if(n%i==0){
                    flag=1;
                }
            }
        }
        if (n==0){
            System.out.println("it is neither prime nor composite");
        }else if(flag==1 || n==1){
            System.out.println("it is not a prime number");
        }else{
            System.out.println("it is a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        Prime prime = new Prime();
        prime.primeNo(n);
        sc.close();
    }
}