package LLD.designPatterns.creational.Factory.normal;

//Factory for UIFactory
public class UIFactoryFactory {

    public static UIFactory getUIFactory(SupportedPlatforms platform){
        switch (platform){
            case WINDOWS : return new WindowsFactory();
            case IOS: return new IosFactory();
            case ANDROID: return new AndroidFactory();
        }
        return null;
    }
}
