package LLD.designPatterns.structural.adapter;

public interface BankAPIAdapter {
    double checkBalance(User user);
    int doTransaction(User fromUser, User toUser, double amount);
    boolean addBankDetails(BankDetails bankDetails);
}
