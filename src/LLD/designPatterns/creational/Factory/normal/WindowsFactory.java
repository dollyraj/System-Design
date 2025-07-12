package LLD.designPatterns.creational.Factory.normal;

import LLD.designPatterns.creational.Factory.components.button.Button;
import LLD.designPatterns.creational.Factory.components.button.WindowsButton;
import LLD.designPatterns.creational.Factory.components.dropdown.Dropdown;
import LLD.designPatterns.creational.Factory.components.dropdown.WindowsDropdown;
import LLD.designPatterns.creational.Factory.components.menu.Menu;
import LLD.designPatterns.creational.Factory.components.menu.WindowsMenu;

public class WindowsFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new WindowsDropdown();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
