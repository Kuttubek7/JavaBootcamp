package ex03;
import ex01.UserIdsGenerator;
import java.util.UUID;

public class User {
    private int identifier;
    private String name;
    private Integer balance;
    private TransactionsList transactions;

    public User(){
        this.identifier = UserIdsGenerator.getInstance().generateId();
    }

    public int getIdentifier(){
        return identifier;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setBalance(Integer balance){
        if (balance < 0){
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }
    public Integer getBalance(){
        return balance;
    }

    public void setTransactions(TransactionsList transactions){
        this.transactions = transactions;
    }
    public TransactionsList getTransactions(){
        return transactions;
    }
    @Override
    public String toString() {
        return "User{" +
                "identifier=" + identifier +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

class Transaction {
    enum transfer_category {
        debits,
        credits
    }
    private UUID Identifier;
    private User Recipient;
    private User Sender;
    private transfer_category TransferCategory;
    private Integer TransferAmount;
    public void setIdentifier(UUID Identifier){
        this.Identifier = Identifier;
    }
    public UUID getIdentifier(){
        return Identifier;
    }

    public void setRecipient(User Recipient){
        this.Recipient = Recipient;
    }
    public User getRecipient(){
        return Recipient;
    }

    public void setSender(User Sender){
        this.Sender = Sender;
    }
    public User getSender(){
        return Sender;
    }

    public void setTransferCategory(transfer_category TransferCategory){
        this.TransferCategory = TransferCategory;
    }
    public transfer_category getTransferCategory(){
        return TransferCategory;
    }

    public void setTransferAmount(Integer TransferAmount){
        if (TransferCategory == transfer_category.credits && TransferAmount > 0 ||
                TransferCategory == transfer_category.debits && TransferAmount < 0){
            this.TransferAmount = 0;
        } else {
            this.TransferAmount = TransferAmount;
        }
    }
    public Integer getTransferAmount(){
        return TransferAmount;
    }
}

