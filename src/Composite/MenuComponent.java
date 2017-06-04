package Composite;

import java.util.Iterator;

/**
 * All components must implement MenuComponent interface.
 * Provide default implementation for every method. Some methods only makes sense for MenuItems and some other
 * for Menus, so default implementation is an exception, therefore both classes have to override the
 * supported methods.
 *
 * Created by leonardo on 04/06/17.
 */
public abstract class MenuComponent {

    //composite methods
    void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    //operation methods used by the items
    String getName() {
        throw new UnsupportedOperationException();
    }

    String getDescription() {
        throw new UnsupportedOperationException();
    }

    double getPrice() {
        throw new UnsupportedOperationException();
    }

    boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    void print() {
        throw new UnsupportedOperationException();
    }

    Iterator<MenuComponent> createIterator() {
        throw new UnsupportedOperationException();
    }
}