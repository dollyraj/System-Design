package LLD.designPatterns.creational.Factory.normal;

import LLD.designPatterns.creational.Factory.components.button.Button;
import LLD.designPatterns.creational.Factory.components.dropdown.Dropdown;
import LLD.designPatterns.creational.Factory.components.menu.Menu;

//factory for UI components
public interface UIFactory {

    Menu createMenu();
    Dropdown createDropdown();
    Button createButton();
}
