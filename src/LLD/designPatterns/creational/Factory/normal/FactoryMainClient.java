package LLD.designPatterns.creational.Factory.normal;

import LLD.designPatterns.creational.Factory.components.button.Button;
import LLD.designPatterns.creational.Factory.components.dropdown.Dropdown;
import LLD.designPatterns.creational.Factory.components.menu.Menu;

public class FactoryMainClient {
    public static void main(String[] args) {
        Flutter flutter=new Flutter(SupportedPlatforms.WINDOWS);
        UIFactory uiFactory=flutter.uiFactory();
        Menu menu= uiFactory.createMenu();
        Dropdown dropdown= uiFactory.createDropdown();
        Button button= uiFactory.createButton();
    }
}
