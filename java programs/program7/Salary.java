package program7;

public class Salary {
    double basic;
    double da;
    double hra;
    double grossSalary(){
        return basic+basic*(da/100)+basic*(hra/100);
    }
    public Salary(double basic,double da,double hra){
        this.basic=basic;
        this.da=da;
        this.hra=hra;
    }
}
