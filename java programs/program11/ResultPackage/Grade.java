package program11.ResultPackage;

import program11.StudentPackage.RegisterStudent;
import program11.StudentPackage.Marks;
import java.util.*;
public class Grade {
    Scanner sc= new Scanner(System.in);
    public int marks[] = new int[6];
    public int creditPoints[] =  new int[6];
    public void getMarks(RegisterStudent stud){
        for(int i=0;i<6;i++){
            System.out.println("Enter the marks for subject "+stud.subject[i]);
            marks[i]=sc.nextInt();
        }
    }

    public void grading(RegisterStudent stud, int sem, Marks m) throws Exception{
        float creditPointSum=0;
        float SGPA;
        for(int i=0;i<6;i++){
            if(marks[i]>=90){
                System.out.println("Grade for subject "+stud.subject[i]+" is S");
                creditPoints[i]=stud.credits[i]*10;
            }
            else if(marks[i]>=80){
                System.out.println("Grade for subject "+stud.subject[i]+" is A");
                creditPoints[i]=stud.credits[i]*9;
            }
            else if(marks[i]>=70){
                System.out.println("Grade for subject "+stud.subject[i]+" is B");
                creditPoints[i]=stud.credits[i]*8;
            }
            else if(marks[i]>=60){
                System.out.println("Grade for subject "+stud.subject[i]+" is C");
                creditPoints[i]=stud.credits[i]*7;
            }
            else if(marks[i]>=50){
                System.out.println("Grade for subject "+stud.subject[i]+" is D");
                creditPoints[i]=stud.credits[i]*6;
            }
            else if(marks[i]>=40){
                System.out.println("Grade for subject "+stud.subject[i]+" is E");
                creditPoints[i]=stud.credits[i]*5;
            }
            else{
                System.out.println("Grade for subject "+stud.subject[i]+" is F");
                creditPoints[i]=stud.credits[i]*4;
            }
            creditPointSum+=creditPoints[i];
        }
        SGPA=(creditPointSum/stud.creditSum);
        if(SGPA>10)
            throw new Exception("InvalidSGPA");
        System.out.println("SGPA of student is "+SGPA);
        m.SGPA[sem-1]=SGPA;
    }
}
