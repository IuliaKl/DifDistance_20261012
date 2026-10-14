public class Point {
    double x,y;
   // final double p = (0;0);

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    //сортировка отрезков до точки 0.0

    public static double distanceTo0(Point p1, Point p2) {
       Point new p0(0.0,0.0);
       double dx = p1.x - p0.x;
        double dy = p1.y - p0.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
