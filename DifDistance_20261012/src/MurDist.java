public class MurDist implements ICalcDist {
    @Override
    public double calcDist(Point p1, Point p2) {
        return Math.max(Math.abs(p2.x- p1.x),Math.abs(p2.y- p1.y));
    }
}
