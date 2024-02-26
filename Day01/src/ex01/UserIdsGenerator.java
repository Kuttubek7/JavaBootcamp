package ex01;

public class UserIdsGenerator {
    private static UserIdsGenerator userIdsGenerator = null;
    private int id = 0;
    public static UserIdsGenerator getInstance() {
        if(userIdsGenerator == null) {
            userIdsGenerator = new UserIdsGenerator();
        }
        return userIdsGenerator;
    }
    public int generateId() {
        return this.id++;
    }
}