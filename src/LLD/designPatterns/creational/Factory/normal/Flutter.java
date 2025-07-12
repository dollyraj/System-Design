package LLD.designPatterns.creational.Factory.normal;

public class Flutter {

    private SupportedPlatforms platform;

    public Flutter(SupportedPlatforms platform) {
        this.platform = platform;
    }

    public void setTheme(){

    }

    public void setSounds(){

    }

    public UIFactory uiFactory(){
       return UIFactoryFactory.getUIFactory(platform);
    }


}
