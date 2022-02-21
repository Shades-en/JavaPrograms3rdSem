package program12;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedList<String> ll= new LinkedList<String>();
        System.out.println("1.Enter the member of linked list");
        System.out.println("2.Print names whos length <5");
        System.out.println("3.Exit");
        while(true){
            System.out.println("Enter a choice");
            int ch= sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter a string");
                    String str= sc.next();
                    ll.add(str);
                    break;

                case 2:
                    if(ll.size()==0)
                        System.out.println("List is empty");
                    else{
                        Boolean x =false;
                        Iterator<String> itr = ll.iterator();
                        while(itr.hasNext()){
                            x=true;
                            String e=itr.next();
                            if(e.length()<5){
                                System.out.println(e);
                            }    
                        }
                        if(x==false){
                            System.out.println("No element less than 5 length");
                        }
                    }
                    break;
                
                case 3:
                    System.exit(0);

                default:
                    System.out.println("Wrong choice \n");
                    break;
            }
        }
    }
}
