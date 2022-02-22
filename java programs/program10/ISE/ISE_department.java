package program10.ISE;

import java.util.*;

import program10.Department;
import program10.Faculty;


public class ISE_department implements Department{

    public void readdata(Faculty f) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the faculty");
        f.name = sc.next();
        System.out.println("Enter the designation of the faculty");
        f.designation= sc.next();
        System.out.println("Enter the age of faculty");
        f.age=sc.nextInt();
        if(f.age>58){
            throw new Exception("AgeException");
        }
        System.out.println("Enter years of expirience");
        f.years_of_experience=sc.nextInt();
        System.out.println("Enter joining date");
        f.joining_date =sc.next();
        System.out.println("Enter the subjects handled by faculty");
        f.subjects_handled=sc.next();
        System.out.println("Enter the number of research consultancy projects taken by faculty");
        f.number_research_consultancy_projs=sc.nextInt();
        System.out.println("Enter the number of designations faculty has till date");
        f.number_designations=sc.nextInt();
    }
    
    public void printdata(Faculty f){
        System.out.println("The name of the faculty "+ f.name);
        System.out.println("The designation of faculty is "+f.designation);
        System.out.println("The age of the faculty is "+f.age);
        System.out.println("The faculty has expirience of "+f.years_of_experience);
        System.out.println("Faculty joined on "+f.joining_date);
        System.out.println("Subjects handled by the faculty are "+f.subjects_handled);
    }

    public void printNumberDesignations(Faculty f){
        System.out.println("The number of designations faculty has till date are "+f.number_designations);
    }

    public void print_number_research_consultancy_projs(Faculty f){
        System.out.println("The number of research projects the department has till date are" + f.number_research_consultancy_projs);
    }
}
