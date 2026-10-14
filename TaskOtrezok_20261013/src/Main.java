import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
//Создать список Точек упорядочить по расстоянию до Точки(0, 0)
// Создать список Отрезков (каждый отрезок включает 2 точки)
// Упорядочить отрезки по длине
// Найти среднюю, медианную и модную длины отрезков в списке
public class Main {

    public static void main(String[] args) {
       ArrayList<Point> poits =inputPointList(scaner,4);
        //ArrayList<Segment> segments = inputSegnentList(2);
       //segments.addFirst(0,0);

        poits.sort(Comparator.comparingDouble(Point::distanceTo0));



        ArrayList<Segment>segments = new ArrayList<>();
        for (int i = 0; i < poits.size(); i+=2) {

            segments.add(new Segment(poits.get(i), poits.get(i + 1)));

            //вывести отсортировные точки в консоль
        }


        segments.sort(Comparator.comparingDouble(Point::distanceSeg);

        // вывести отсортированные списки в консоль

        List<Double>len = new ArrayList<>();
        for (Segment s:segments){
            len.add(s.distanceSeg());
        }
        System.out.println("ср длина" + average(len));
        System.out.println("медиана " + median(len));



    }


    public static ArrayList<Point>inputPointList(Scanner scanner, int n) {
        ArrayList<Point>points=new ArrayList<>();
        //Scanner scanner = new Scanner(System.in);
        for (int i=0; i<n; i++) {
            System.out.println("ведите координаты точки : " + (i + 1));
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            points.add(new Point(x, y));
        }
        return points;
    }

    private static double average(List<Double>values) {
        double sum = 0;
        for (double v : values) sum += v;
        return sum / values.size();
    }
    private static double median(List<Double>values){
        List<Double> sorted = new ArrayList<>(values);
        sorted.sort(Double::compare);
        int n = sorted.size();
        if (n%2==1) return sorted.get(n/2);
        return (sorted.get(n/2-1 +sorted.get(n/2))/2.0);

}

}
