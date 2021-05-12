public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double height,double radius, String coler){
        super(radius,coler);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getSurroundingArea(){
        return 2*Math.PI*getRadius()*height;
    }
    public double getTotalArea(){
        return 2*Math.PI*getRadius()*(getRadius()+height);
    }
    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "height= " + height +
                ", radius= "+getRadius()+
                ", coler = "+getColer()+
                ", SurroundingArea= "+getSurroundingArea()+
                ", Total Area= "+getTotalArea()+
                ", Volume = "+getVolume();
    }
}
