package program7;

public class Person {
    String name;
    int age;
    String education;
    Salary salary;
    Loan loan;
    int yearsOfExperience;

    boolean isEligible(){
        if(loan.totalLoan>salary.grossSalary()*12*0.6){
            return true;
        }
        else{
            return false;
        }
    }

    double taxPay(){
        return salary.grossSalary()*0.1;
    }

    boolean isEligiblePromotion(){
        if(yearsOfExperience>=10){
            return true;
        }
        else return false;
    }

    void display(){
        System.out.println("name="+ name);
        System.out.println("age="+ age);
        System.out.println("Education="+education);
        System.out.println("total salary="+(salary.grossSalary()-taxPay()));
    }

    public Person(String name,int age,String education,Salary salary,Loan loan,int yearsOfExperience){
        this.name=name;
        this.age=age;
        this.education=education;
        this.salary=salary;
        this.loan=loan;
        this.yearsOfExperience=yearsOfExperience;
    }

}
