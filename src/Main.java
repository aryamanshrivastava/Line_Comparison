public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,4);
        Point p2 = new Point(2,3);
        Point p3 = new Point(3,8);
        Point p4 = new Point(4,20);
        Line l1 = new Line(p1,p2);
        Line l2 = new Line(p3,p4);
        double difference = Math.abs(l1.length() - l2.length());
        System.out.println("Difference between the two lines is: " + difference);
    }
}