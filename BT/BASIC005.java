package BT;

import java.util.Scanner;

public class BASIC005 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while (t-- > 0) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                int a = s.nextInt();
                sum += a;
            }
            System.out.println(sum);
        }
    }
}
