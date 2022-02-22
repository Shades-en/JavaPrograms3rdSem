package program12;

import java.util.Scanner;
import java.util.ArrayList;

public class QueueC {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> Q = new ArrayList<String>();
        System.out.println("1.Enqueue");
        System.out.println("2.Dequeue");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        while(true){
            System.out.println("Enter choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the element to enqueue");
                    String str= sc.next();
                    Q.add(Q.size(), str);
                    break;
                
                case 2:
                    if(Q.isEmpty()){
                        System.out.println("Empty queue");
                    }
                    else
                        System.out.println("The removed element is "+ Q.remove(0));
                    break;

                case 3:
                    if(Q.isEmpty()){
                        System.out.println("Empty queue");
                    }
                    else{
                        for(int i=0;i<Q.size();i++){
                            System.out.println(Q.get(i));
                        }
                    }
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Wrong choice \n");
                    break;
            }
        }
    }
}
