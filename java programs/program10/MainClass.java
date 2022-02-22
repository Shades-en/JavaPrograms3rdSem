package program10;

import java.util.*;

import program10.ISE.ISE_department;

public class mainclass {
    public static void main(String []args) throws Exception {
        Faculty f[] = new Faculty[20];
        ISE_department Ise = new ISE_department();
        int counter=0;
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("1. Enter the details of the faculty");
            if(counter>0){
                System.out.println("2. Read the details of a faculty member");
                System.out.println("3. Know the details of faculty members with experience >= 20");
                System.out.println("4. Print the number of designations of the faculty member");
                System.out.println("5. Print the number of consultancy projects of the faculty");
                System.out.println("6. Exit");
            }

            System.out.println("Enter the choice");
            int ch= sc.nextInt();
            switch(ch){
                case 1:
                    f[counter] = new Faculty();
                    Ise.readdata(f[counter++]);
                    break;

                case 2:
                    System.out.println("Enter the name of the faculty member to read");
                    String name= sc.next();
                    Boolean p1=false;
                    for(int i=0;i<counter;i++){
                        if(f[i].name.equals(name)){
                            Ise.printdata(f[i]);
                            p1=true;
                        }
                    }
                    if(p1==false)
                        System.out.println("Faculty not found");
                    break;

                case 3:
                    System.out.println("The details are");
                    p1=false;
                    for(int i=0;i<counter;i++){
                        if(f[i].years_of_experience>=20){
                            Ise.printdata(f[i]);
                            p1=true;
                        }
                    }
                    if(p1==false)
                        System.out.println("Faculty not found");
                    break;

                case 4:
                    System.out.println("Enter the name of the faculty member to read");
                    name= sc.next();
                    p1=false;
                    for(int i=0;i<counter;i++){
                        if(f[i].name.equals(name)){
                            Ise.printNumberDesignations(f[i]);
                            p1=true;
                        }
                    }
                    if(p1==false)
                        System.out.println("Faculty not found");
                    break;
                    
                case 5:
                    System.out.println("Enter the name of the faculty member to read");
                    name= sc.next();
                    p1=false;
                    for(int i=0;i<counter;i++){
                        if(f[i].name.equals(name)){
                            Ise.print_number_research_consultancy_projs(f[i]);
                            p1=true;
                        }
                    }
                    if(p1==false)
                        System.out.println("Faculty not found");
                    break;
                
                case 6:
                    System.exit(0);

                default:
                    System.out.println("Wrong choice");
            }
        }
        
    }
}
