public class Line {
    Point p1;
    Point p2;
    Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public double length() {
        int xDiff = p2.x - p1.x;
        int yDiff = p2.y - p1.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
