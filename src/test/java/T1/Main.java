package T1;

import org.junit.jupiter.api.Test;
import sun.java2d.loops.GeneralRenderer;

public class Main{
    public static void main(String[] args) {
        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);
    }
}
class Rectangle extends GeometricObject{
    private double c;
    private double k;

    public Rectangle(double c, double k) {
        this.c = c;
        this.k = k;
    }

    public double getArea(){
        return c*k;
    }

    @Override
    public double getPerimeter() {
        return c;
    }
}