package BT;

import java.util.Scanner;

public class ELAB2312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) { // Kiểm tra xem có phần tử nào nữa không
            String a = sc.nextLine();
            int cnt = 0;
            for (int i = 0; i < a.length(); ++i)
                if (a.charAt(i) >= '0' && a.charAt(i) <= '9') // charAt() lay ky tu tai vi tri i
                    cnt++;
            System.out.println(cnt);
        }

        sc.close();
    }
}