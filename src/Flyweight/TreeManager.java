package Flyweight;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leonardo on 15/11/17.
 */
public class TreeManager {

    List<Tree> gardenTrees;

    /**
     * Draw a column and row of 5 trees, using always same object.
     */
    @Test
    public void test(){
        gardenTrees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Tree tree = TreeFactory.createTree();
            tree.display(i, 0, 5);
            tree.display(0, i, 5);
        }
    }
}
