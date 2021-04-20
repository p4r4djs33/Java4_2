public class Test {
    public static void main(String[] args) {
        Point point = new Point(5,5);
        System.out.println(point.toString());
        MoveablePoint point2 = new MoveablePoint(5,5,6,6);
        System.out.println(point2.move());
        // System.out.println(point2.toString());

    }
}
