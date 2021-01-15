package Home.work;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,4);
        Point p2 = new Point(2, 5);
        System.out.println(distance(p1, p2));
    }
    public static double distance(Point p1, Point p2){
       return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));


}}