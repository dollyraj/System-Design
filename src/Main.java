import LLD.designPatterns.creational.Singleton.Singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Singleton s3=Singleton.getInstance();
        Singleton s4=Singleton.getInstance();
    }
}