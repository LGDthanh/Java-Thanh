package BT;

import java.util.Scanner;

public class BASIC001 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while (t-- > 0) {
            String a = s.nextLine();
            System.out.println(a);
        }
    }

}
