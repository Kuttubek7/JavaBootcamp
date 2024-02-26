package ex02;

public class Program {
    public static void main(String[] args){
        UsersList userList = new UsersArrayList();
        check(userList.getSize() == 0);

        for (int i = 0; i < 5; i++){
            userList.addUser(createNewUser(i));
        }

        check(userList.getSize() == 5);
        for (int i = 0; i < userList.getSize(); i++){
            User user = userList.getByIndex(i);
            check(user.getIdentifier() == i);
            check(user.getBalance() == 100 + i);
            check(user.getName().equals("User_" + i));
        }

        check(userList.getSize() == 5);

        for (int i = 0; i < userList.getSize(); i++){
            userList.getById(i);
        }
        try {
            userList.getById(userList.getSize());
        } catch (UserNotFoundException e){
        }
        check(userList.getByIndex(userList.getSize()) == null);
        check(userList.getByIndex(-1) == null);
    }

    private static User createNewUser(int num){
        User user = new User();
        user.setName("User_" + num);
        user.setBalance(100 + num);
        return user;
    }
    private static void check(boolean statement){
        if (!statement){
            System.out.println("ERROR");
        }
    }
}
