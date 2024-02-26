package ex02;

import ex01.UserIdsGenerator;

public class User {

    private Integer identifier;
    private String Name;
    private Integer Balance;


    public User(){
        this.identifier = UserIdsGenerator.getInstance().generateId();
    }

    public int getIdentifier(){
        return identifier;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public void setBalance(Integer Balance){
        if (Balance < 0){
            this.Balance = 0;
        } else {
            this.Balance = Balance;
        }
    }
    public Integer getBalance(){
        return Balance;
    }
}
