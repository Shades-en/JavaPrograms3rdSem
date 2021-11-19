package program8;


public class Circle{
    float radius;
    Circle(float radius){
        this.radius=radius;
    }

    float circleArea(){
        float area=(float)(3.14*radius*radius);
        return area;
    }
}

class Sector extends Circle{
    float radians;
    Sector(float radius, float radians){
        super(radius);
        this.radians=radians;
    }

    float sectorArea(){
        float area=(float)(0.5*radius*radius*radians);
        return area;
    }
}

class Segment extends Circle{
    float length;
    Segment(float radius, float length){
        super(radius);
        this.length=length;
    }

    float segmentArea(){
        float area=(float)(radius*radius*((radius-length)/radius)-(radius-length)*Math.pow((2*radius*length)-(length*length),0.5));
        return area;
    }
}

