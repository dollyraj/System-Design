package LLD.designPatterns.creational.Factory.normal;

import LLD.designPatterns.creational.Factory.components.button.AndroidButton;
import LLD.designPatterns.creational.Factory.components.button.Button;
import LLD.designPatterns.creational.Factory.components.dropdown.AndroidDropdown;
import LLD.designPatterns.creational.Factory.components.dropdown.Dropdown;
import LLD.designPatterns.creational.Factory.components.menu.AndroidMenu;
import LLD.designPatterns.creational.Factory.components.menu.Menu;

public class AndroidFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
