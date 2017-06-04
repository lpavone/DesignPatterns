package Composite;

import java.util.Iterator;

/**
 * Created by leonardo on 04/06/17.
 */
public class NullIterator implements Iterator<MenuComponent>{

    public MenuComponent next(){
        return null;
    }

    public boolean hasNext(){
        return false;
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }

}
