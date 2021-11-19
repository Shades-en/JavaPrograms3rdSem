package program5;

import java.util.*;

public class Matrices {
    int array[][];
    int column;
    int row;

    Scanner sc = new Scanner(System.in);

    public Matrices(int row, int column){
        this.row = row;
        this.column = column;
        this.array = new int[row][column];
    }

    void getInput(){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array[i][j] = sc.nextInt();
            }
        }
    }

    int matrixMul(Matrices m1, Matrices m2){
        int flag=0;
        if(m1.column!=m2.row){
            flag=1;
        }
        else{
            for(int i=0;i<m1.row;i++){
                for(int j=0;j<m2.column;j++){
                    for(int k=0;k<m1.column;k++){
                        array[i][j]+=m1.array[i][k]*m2.array[k][j];
                    }
                }
            }
        }
        return flag;
    }

    void printMatrix(){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(array[i][j]+"\t");
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //for matrix 1
        System.out.println("Enter no. of rows and columns for matrix 1");
        int row1=sc.nextInt();
        int column1=sc.nextInt();
        Matrices m1=new Matrices(row1, column1);
        System.out.println("Enter matrix elements");
        m1.getInput();

        //for matrix 2
        System.out.println("Enter no. of rows and columns for matrix 2");
        int row2=sc.nextInt();
        int column2=sc.nextInt();
        Matrices m2=new Matrices(row2, column2);
        System.out.println("Enter matrix elements");
        m2.getInput();

        //declaration of matrix 3 and multiplication
        Matrices m3=new Matrices(m1.row, m2.column);
        int flag=m3.matrixMul(m1, m2);
        System.out.println("matrix 1 is");
        m1.printMatrix();
        System.out.println("matrix 2 is");
        m2.printMatrix();
        if (flag==1){
            System.out.println("Multiplication not possible");
        }
        else{
            System.out.println("Multiplied matrix is ");
            m3.printMatrix();
        }
        sc.close();
    }
}
