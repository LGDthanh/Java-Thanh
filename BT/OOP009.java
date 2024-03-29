package BT;

import java.util.Scanner;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double slope(Point other) {
        if (this.x == other.x) {

            return -1;
        } else if (this.y == other.y) {
            return 0;
        }
        {
            return (double) (other.y - this.y) / (other.x - this.x);
        }
    }

}

public class OOP009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            Point point1 = new Point(x1, y1);
            Point point2 = new Point(x2, y2);
            System.out.println(point1.slope(point2));
        }
    }
}