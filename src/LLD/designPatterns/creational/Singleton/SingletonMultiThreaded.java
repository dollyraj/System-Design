package LLD.designPatterns.creational.Singleton;

public class SingletonMultiThreaded {
    private static SingletonMultiThreaded instance = null;

    private SingletonMultiThreaded() {}

    public static SingletonMultiThreaded getInstance() {
        if(instance == null) { // Double-checked locking
            synchronized (SingletonMultiThreaded.class) {
                if (instance == null) {
                    instance = new SingletonMultiThreaded();
                }
            }
        }
        return instance;
    }
}
// Write a basic singleton class,
//  write multi-threaded code to create multiple singleton object
// Write a double check locked singleton class, then see if the solution works
