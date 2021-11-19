package program1;

import java.util.Scanner;

public class Bsort {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the elements of array are");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The elements after sorting are");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        sc.close();
    }
}
