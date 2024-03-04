package BT;

import java.util.Scanner;

public class BASIC003 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while (t-- > 0) {
            String name = s.nextLine();
            System.out.println("Hi " + name);

        }
    }
}