package program1;

import java.util.Scanner;

public class prime {
    static boolean isPrime(int n){
        if(n==2)
            return true;
        else{
            for(int i=2;i<n-1;i++){
                if(n%i==0)
                    return false;
            }return true;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check");
        int n= sc.nextInt();
        if(n==1|| n==0){
            System.out.println("Neither prime nor composite");
        }
        else{
            System.out.println(isPrime(n));
        }
    }
}
