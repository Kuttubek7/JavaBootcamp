package ex01;

public class Program {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            User user = new User();
            check(user.getIdentificator() == i);
            System.out.println(user.getIdentificator());
        }
    }

    public static void check(boolean flag) {
        if(!flag) {
            System.err.println("ERROR!");
        } else {
            System.out.println("SUCCES!");
        }
    }
}

