import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Point{
//	int x, y;
//}
//
//Сделать интерфейс "вычисление расстояния"
//Реализации:
//	- по Евклиду
//	- по фон Нейману
//	- по Муру
//
//Сделать в Main список из 5 точек, которые введет пользователь
//
//Написать функцию нахождения кратчайшего расстояния по списку точек, которая сможет использовать любой из методов вычисления расстояния


public class Main {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();

        inputPoints(points);


        //minDistCalc(points,calc);

        ICalcDist euclid = new EuclidDist();
        int euclidMin = minDistCalc(points, euclid);
        ICalcDist neiman = new NeimanDist();
        int neimanMin = minDistCalc(points, neiman);
        ICalcDist mur = new MurDist();
        int murMin = minDistCalc(points, mur);


        System.out.println("Расстояние по Евклиду " + euclidMin);
        System.out.println("Расстояние по фон Нейману " + neimanMin);
        System.out.println("Расстояние по Муру " + murMin);


//        mu.calcDist(points);
//        ICalcDist m = (points)->minDistCalc(points,minDistCalc(points));
        //       m=minDistCalc(points,ICalcDist)
        //   }   System.out.println("по муру "+m);

        //findShortestDistance(points,(p1,p2)->Math.max(Math.abs(p2.x- p1.x),Math.abs(p2.y- p1.y));)

    }

    private static int minDistCalc(List<Point> points, ICalcDist calc) {
        // функция принимает список точек, перебирает пары, вычисляет расстояние и возвращием минимальное
        Point minP1 = null;
        Point minP2 = null;
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < points.size() - 1; i++) {
            for (int j = i + 1; j < points.size(); j++) {

                int dist = (int) calc.calcDist(points.get(i), points.get(j));
                if (dist < minDist) {
                    minDist = dist;
                    minP1 = points.get(i);
                    minP2 = points.get(j);

                }
            }
        }
        System.out.println("Минимальное расстояние: " + calc + minDist);
        System.out.println("Точка 1: (" + minP1.x + ", " + minP1.y + ")");
        System.out.println("Точка 2: (" + minP2.x + ", " + minP2.y + ")");
        return minDist;
    }


    private static void inputPoints(List<Point> points) {
        Scanner sc = new Scanner(System.in);

        int k;
        do {
            System.out.println("Введите количество точек, их должно быть минимум 2");
            k = sc.nextInt();
        } while (k < 2);

        for (int i = 0; i < k; i++) {
            System.out.println("Введите координаты точки" + (i + 1) + ":");
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new Point(x, y));
        }


        System.out.println("Введены точки:");
        for (Point p : points) {
            System.out.println(p);
        }

    }
}
