package ex01;
public class User {
    private int identificator = 0;
    public User() {
        this.identificator = UserIdsGenerator.getInstance().generateId();
    }

    public int getIdentificator() {
        return identificator;
    }
}