package LLD.designPatterns.structural.adapter;

public class ICICIBankAPILib {

    public double checkBalance(String userToken){
        return 1000;
    }

    public int transferMoney(String fromUserToken,String toUserToken,double amount){

        return 1;
    }

    public boolean addBankAccount(String accountNumber,String IFSC,String phoneNo,int Pin){

        return true;
    }
}
