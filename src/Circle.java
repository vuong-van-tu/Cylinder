public class Circle {
    private double radius;
    private String coler;
    public Circle(){}
    public Circle(double radius,String coler){
        this.radius =radius;
        this.coler=coler;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColer() {
        return coler;
    }
    public void setColer(String coler) {
        this.coler = coler;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "radius=" + radius +
                ", coler=" + coler +
                ", Area= "  +getArea()
                ;
    }
}
