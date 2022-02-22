package program11.StudentPackage;

public class Marks {
    public float SGPA[]= new float[4];
    float CGPA=0;

    public void calCGPA(){
        for(int i=0;i<4;i++){
            CGPA+=SGPA[i];
        }
        CGPA=CGPA/4;
        System.out.println("CGPA = "+CGPA);
    }
}
