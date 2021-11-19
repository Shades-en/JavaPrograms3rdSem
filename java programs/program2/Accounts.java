package program2;

import java.util.*;

public class Accounts {

    float balAmt = 0;
    String name;
    long phNum;
    long AccNo;
    Scanner sc= new Scanner(System.in);

    void getInput(){
        System.out.println("Enter the account name");
        name=sc.next();
        System.out.println("Enter account nummber");
        AccNo=sc.nextLong();
        System.out.println("Enter phone number");
        phNum=sc.nextLong();
        System.out.println("current balance= "+balAmt);
        System.out.println();
    }

    void deposit(){
        System.out.println("Enter the amount to be deposited \n");
        float dep=sc.nextFloat();
        balAmt+=dep;
        System.out.println("The new balance= "+balAmt);
        System.out.println();
    }

    void withdraw(){
        System.out.println("Enter the amount to withdraw");
        float draw=sc.nextFloat();
        balAmt-=draw;
        System.out.println("The new balance= "+balAmt);
        System.out.println();
    }

    void display(){
        System.out.println("The details are------");
        System.out.println("Name= "+name);
        System.out.println("Account number= "+AccNo);
        System.out.println("Phone number="+phNum);
        System.out.println("Balance= "+balAmt);
    }

    public static void main(String[] args) {
        Accounts ac= new Accounts();
        Scanner sc= new Scanner(System.in);
        System.out.println("1.Enter details 2.Deposit 3.Withdraw 4.display details");
        while(true){
            System.out.println("Enter a choice");
            int ch= sc.nextInt();
            switch(ch){
                case 1:
                    ac.getInput();
                    break;

                case 2:
                    ac.deposit();
                    break;
                
                case 3:
                    ac.withdraw();
                    break;

                case 4:
                    ac.display();
                    break;
                
                case 5:
                System.exit(0);

                default:System.out.println("Wrong choice");
            }
        }
    }
}
