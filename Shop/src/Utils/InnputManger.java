package Utils;

import java.util.Scanner;

public class InnputManger {
    Scanner sc = new Scanner(System.in);

    public int getNumber(String msg, int min, int max) {
        while (true) {
            try {
                int num = Integer.parseInt(sc.nextLine());
                if (num < min || num > max){
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }
                sc.nextLine();
                return num;
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
                sc.nextLine();
            }
        }
    }
    public String getString(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }
}
