public class Segment {
    Point endSeg1, endSeg2;


    @Override
    public String toString() {
        return "Segment{" +
                " " + endSeg1 +
                " " + endSeg2 +
                '}';
    }


    public Segment(Point endSeg1, Point endSeg2) {
        this.endSeg1 = endSeg1;
        this.endSeg2 = endSeg2;

    }
    // определение длины отрезков-расчет расстояния между точками
    public double distanceSeg(Point p1, Point p2) {

        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    }


