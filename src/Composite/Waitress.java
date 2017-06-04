package Composite;

import java.util.Iterator;

/**
 * Client program.
 *
 * Created by leonardo on 04/06/17.
 */
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVegetarian Menu\n------");
        while (iterator.hasNext()){
            MenuComponent mc = iterator.next();
            try {
                if (mc.isVegetarian()){
                    mc.print();
                }
            } catch (UnsupportedOperationException e){}
        }
    }
}
