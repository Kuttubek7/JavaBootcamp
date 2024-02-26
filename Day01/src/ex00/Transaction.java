package ex00;
import java.util.UUID;

public class Transaction {
    private UUID identificator;
    private User recipient;
    private User sender;
    public enum TransferCategory {
        DEBITS,
        CREDITS
    }
    private TransferCategory transferCategory;

    private int transferAmount;

    public Transaction(User sender, User recipient, TransferCategory transferCategory, Integer transferAmount) {
        this.getIdentificator(UUID.randomUUID());
        this.setSender(sender);
        this.setRecipient(recipient);
        this.setTransferCategory(transferCategory);
        setTransferAmount(transferAmount);
    }
    public void getIdentificator(UUID identificator) {
        this.identificator = identificator;
    }
    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }
    public void setSender(User sender) {
        this.sender = sender;
    }
    public void setTransferCategory(TransferCategory transferCategory) {
        this.transferCategory = transferCategory;
    }
    public void setTransferAmount(int transferAmount) {
        if(transferCategory == TransferCategory.CREDITS && (transferAmount > 0 || sender.getBalance() < -transferAmount)) {
            System.err.println("Error, incorrect amount or sign transfer amount");
        } else if (transferCategory == TransferCategory.DEBITS && (transferAmount < 0 || sender.getBalance() < transferAmount)) {
            System.err.println("Error,incorrect sign or transfer amount");
        }
        this.transferAmount = transferAmount;
        changeBalanceUsers();
    }

    private void changeBalanceUsers() {
        if (transferCategory == TransferCategory.CREDITS) {
            sender.setBalance(sender.getBalance() + transferAmount);
            recipient.setBalance(recipient.getBalance() - transferAmount);
        } else if (transferCategory == TransferCategory.DEBITS) {
            sender.setBalance(sender.getBalance() + transferAmount);
            recipient.setBalance(recipient.getBalance() - transferAmount);
        }
    }

    private void error(String message) {
        System.err.println(message);
        System.exit(-1);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "identifier=" + identificator +
                ", sender=" + sender +
                ", recipient=" + recipient +
                ", transferCategory=" + transferCategory +
                ", transferAmount=" + transferAmount +
                '}';
    }
}
