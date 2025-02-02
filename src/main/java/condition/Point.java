package condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(1, 2, 3, 4);
        System.out.println("result (1, 2) to (3, 4) " + result2);
        double result3 = Point.distance(12, 13, 14, 15);
        System.out.println("result (12, 13) to (14, 15) " + result3);
    }
}
