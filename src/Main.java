public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(5,"Red");
        System.out.println(circle);

        circle = new Circle(10,"blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(20);
        System.out.println(cylinder);

        cylinder = new Cylinder(5,3,"red");
        System.out.println(cylinder);
    }
}
