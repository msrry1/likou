package T1;

/**
 * @ClassName:Octagon
 * @Auther: Lyh
 * @Date: 2022/10/16 14:55
 * @Version: v1.0
 */
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;// 八边形边长

    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon1 = new Octagon(5);
        System.out.println(octagon1);
        Octagon octagon2 = octagon1.clone();
        int result = octagon1.compareTo(octagon2);
        System.out.println("两八边形比较结果为:\n"+(result==0?"一模一样":"有所不同"));
    }

    // 构造方法
    public Octagon(double side) {
        super();
        this.side = side;
    }

    @Override
    public int compareTo(Octagon o) {

        return (int) (getArea() - o.getArea());
    }

    @Override
    public double getArea() {

        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {

        return 8 * side;
    }

    @Override
    protected Octagon clone() throws CloneNotSupportedException {

        return (Octagon) super.clone();
    }

    @Override
    public String toString() {
        return "八边形 [边长side=" + side + ", 面积=" + getArea() + ", 周长=" + getPerimeter() + "]";
    }
}