package program7;

public class DemoPerson {
    public static void main(String[] args) {
        Person person=new Person("Owais Iqbal", 21, "Btech", new Salary(120000,5,7), new Loan(50000,1), 14);
        System.out.println("Eligible for loan="+person.isEligible());
        System.out.println("Tax paid="+person.taxPay());
        System.out.println("Can be promoted="+person.isEligiblePromotion());
        System.out.println("Details:");
        person.display();
    }
}
