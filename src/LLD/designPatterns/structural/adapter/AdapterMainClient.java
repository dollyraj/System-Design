package LLD.designPatterns.structural.adapter;

public class AdapterMainClient {
    public static void main(String[] args) {
        BankAPIAdapter bankAPIAdapter = new AxisBankAdapter();
        PhonePe phonePe = new PhonePe(bankAPIAdapter);
        //phonePe.transferMoney();
    }
}
