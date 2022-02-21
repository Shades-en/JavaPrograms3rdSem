package program11;
import program11.ResultPackage.*;
import program11.StudentPackage.*;

public class Mainclass {
    public static void main(String[]args) throws Exception {
        RegisterStudent r = new RegisterStudent();
        Grade grade = new Grade();
        Marks marks = new Marks();

        r.getName();
        r.getBranch();
        System.out.println();

        System.out.println("FOR SEMESTER 1");
        System.out.println();
        r.register(1);
        grade.getMarks(r);
        grade.grading(r, 1, marks);
        System.out.println();

        System.out.println("FOR SEMESTER 2");
        System.out.println();
        r.register(2);
        grade.getMarks(r);
        grade.grading(r, 2, marks);
        System.out.println();

        System.out.println("FOR SEMESTER 3");
        System.out.println();
        r.register(3);
        grade.getMarks(r);
        grade.grading(r, 3, marks);
        System.out.println();

        System.out.println("FOR SEMESTER 4");
        System.out.println();
        r.register(4);
        grade.getMarks(r);
        grade.grading(r, 4, marks);
        System.out.println();

        marks.calCGPA();
    }
}
