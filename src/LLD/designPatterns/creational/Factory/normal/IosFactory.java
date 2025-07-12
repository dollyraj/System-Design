package LLD.designPatterns.creational.Factory.normal;

import LLD.designPatterns.creational.Factory.components.button.Button;
import LLD.designPatterns.creational.Factory.components.button.IosButton;
import LLD.designPatterns.creational.Factory.components.dropdown.Dropdown;
import LLD.designPatterns.creational.Factory.components.dropdown.IosDropdown;
import LLD.designPatterns.creational.Factory.components.menu.IosMenu;
import LLD.designPatterns.creational.Factory.components.menu.Menu;

public class IosFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }
}
