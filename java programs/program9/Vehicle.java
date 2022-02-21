package program9;

import java.util.Scanner;

public abstract class Vehicle {
    public int year_of_manfacture;
    public Vehicle(){
        year_of_manfacture=2000;
    }
    public abstract void getData();
    public abstract void putData();  
}

class TwoWheeler extends Vehicle{
    public String brand;
    public String Owner;
    public int cost;
    public String fuelType;
    public String color;

    public void getData(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the brand of the vehicle");
        brand= sc.next();
        System.out.println("Enter the name of the owner");
        Owner = sc.next();
        System.out.println("Enter the cost");
        cost= sc.nextInt();
        System.out.println("Enter the fuel type");
        fuelType=sc.next();
        System.out.println("Enter the color");
        color= sc.next();
        System.out.println("Enter year of manufacture");
        year_of_manfacture= sc.nextInt();
    }

    public void putData(){
        System.out.println("Two wheel vehicle details are");
        System.out.println("Brand: "+brand+ " Owner: "+ Owner + " cost: " + cost+ " Fuel: " +fuelType + " Color: "+color +" Year: "+ year_of_manfacture);
    }
}

final class FourWheeler extends Vehicle{
    public String brand;
    public String Owner;
    public int cost;
    public String fuelType;
    public String color;

    public void getData(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the brand of the vehicle");
        brand= sc.next();
        System.out.println("Enter the name of the owner");
        Owner = sc.next();
        System.out.println("Enter the cost");
        cost= sc.nextInt();
        System.out.println("Enter the fuel type");
        fuelType=sc.next();
        System.out.println("Enter the color");
        color= sc.next();
        System.out.println("Enter year of manufacture");
        year_of_manfacture= sc.nextInt();
    }

    public void putData(){
        System.out.println("Four wheelvehicle details are");
        System.out.println("Brand: "+brand+ " Owne: "+ Owner + " cost: " + cost+ " Fuel: " +fuelType + " Color: "+color +" Year: "+ year_of_manfacture);
    }
}

class MyTwoWheeler extends TwoWheeler{
    public MyTwoWheeler(String brand, String Owner, int cost, String fuelType, String color){
        super.brand=brand;
        super.Owner=Owner;
        super.cost=cost;
        super.fuelType=fuelType;
        super.color=color;
    }

    public void printData(){
        System.out.println("My vehicle details are");
        System.out.println("Brand: "+brand+ " Owner: "+ Owner + " cost: " + cost+ " Fuel: " +fuelType + " Color: "+color +" Year: "+ year_of_manfacture);
    }
}

class test{
    public static void main(String[] args) {
        TwoWheeler tw = new TwoWheeler();
        FourWheeler fw= new FourWheeler();
        tw.getData();
        tw.putData();
        fw.getData();
        fw.putData();
        MyTwoWheeler mytw= new MyTwoWheeler("BMW", "Owais", 700000, "Petrol", "Blue");
        mytw.printData();
    }
}
