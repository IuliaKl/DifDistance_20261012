public class NeimanDist implements ICalcDist {
    @Override
    public double calcDist(Point p1, Point p2) {
        return Math.abs(p2.x- p1.x) + Math.abs(p2.y- p1.y);
    }
}
