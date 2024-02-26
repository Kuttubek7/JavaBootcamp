package ex01;
import java.util.*;
public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int isNatural = scanner.nextInt();

        boolean flag = isNatural > 3;
        int natural = 1;


        for (int i = 2; flag && i * i <= isNatural; i++) {
            if (isNatural % i == 0) {
                flag = false;// Если число делится без остатка, то оно не простое
                break;
            }
            natural = i;
            flag = true;
        }
        if (isNatural > 1) {
            System.out.println(flag + " " + natural);
        } else {
            System.err.println("Illegal Argument");
        }
    }
}
