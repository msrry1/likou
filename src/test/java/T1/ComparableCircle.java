package T1;


/**
 * @ClassName:ComparableCircle
 * @Auther: Lyh
 * @Date: 2022/10/16 14:34
 * @Version: v1.0
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public Object max(ComparableCircle o1, ComparableCircle o2) {
        if (o1.compareTo(o2) > 0)
            return o1;
        else
            return o2;
    }

    public int compareTo(ComparableCircle o) {
        if (super.getArea() > o.getArea())
            return 1;
        else if (super.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5.0);
        ComparableCircle c2 = new ComparableCircle(3.0);
        if (c1.compareTo(c2) == 0)
            System.out.println("两圆面积相等！");
        else
            System.out.println("面积较大的圆是" + (c1.compareTo(c2) > 0 ? "c1" + c1 : "c2" + c2));
    }
}
abstract  class GeometricObject{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public String toString() {
        return "created on " + dateCreated.toLocaleString() + "\ncolor: " + color + " and filled: " + filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
class Circle extends GeometricObject {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getRadius());
        return (int) (temp ^ (temp >>> 32));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

    @Override
    public String toString() {
        return "\n这是个圆,面积是" + getArea();
    }

}
