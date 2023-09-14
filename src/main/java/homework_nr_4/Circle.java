package homework_nr_4;
public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea(){

        double circleArea = Math.PI * radius * radius;
        System.out.println(circleArea);

    }
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        circle.calculateArea();

    }
}
