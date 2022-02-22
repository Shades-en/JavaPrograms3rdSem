package program11.StudentPackage;

import java.util.Scanner;
import program11.Student;

public class RegisterStudent implements Student{
    Scanner sc= new Scanner(System.in);
    public String name;
    public String branch;
    public String subject[]= new String[6];
    public int credits[]= new int[6];
    public float creditSum;

    public void getName(){
        System.out.println("Enter the name of the student");
        name=sc.next();
    }
    public void getBranch(){
        System.out.println("Enter the branch of the strudent");
        branch=sc.next();
    }
    public void register(int sem) throws Exception{
        creditSum=0;
        for(int i=0;i<6;i++){
            System.out.println("Enter the name of the subject "+(i+1));
            subject[i]=sc.next();
            System.out.println("Enter the credits of the subject "+(i+1));
            credits[i]=sc.nextInt();
            creditSum+=credits[i];
        }
        if(creditSum>30){
            throw new Exception("CreditLimitException: Maximim credits(30) reached.");
        }
    }
}
