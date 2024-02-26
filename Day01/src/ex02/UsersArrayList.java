package ex02;


public class UsersArrayList implements UsersList {

    private User[] data;
    private int size = 0;
    private int length = 10;

    public UsersArrayList(int length) {
        data = new User[length];
    }

    public UsersArrayList() {
        data = new User[this.length];
    }

    @Override
    public void addUser(User user) {
        if (size >= length){
            grow();
        }
        data[size++] = user;

    }

    @Override
    public User getById(int id) {
        for (int i = 0; i < size; i++){
            if (data[i].getIdentifier() == id){
                return data[i];
            }
        }
        throw new UserNotFoundException("No user with id " + id);
    }

    @Override
    public User getByIndex(int index) {
        if (index <  0 || index > size){
            return null;
        }
        return data[index];
    }

    @Override
    public int getSize() {
        return size;
    }

    private void grow(){
        User[] newData = new User[data.length + data.length / 2];
        for (int i = 0; i < data.length; i++){
            newData[i] = data[i];
        }
        data = newData;
    }
}
class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String msg){
        super(msg);
    }
}
