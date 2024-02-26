package ex02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coffeResult = 0;
        int count = 0;

        for (int i = 0; i < 4; i++) {
            boolean flag = true;
            int isNatural = scanner.nextInt();

            while (isNatural > 0) {
                coffeResult += isNatural % 10;
                isNatural = isNatural / 10;
            }

            for (int j = 2; flag && j * j <= coffeResult; j++) {
                if ((coffeResult % j) == 0) {
                    flag = false;
                    break;
                }
                flag = true;
            }

            if(flag) {
                count++;
            }

            coffeResult = 0;
        }
        System.out.println("Count of coffee-request – " + count);
    }
}
