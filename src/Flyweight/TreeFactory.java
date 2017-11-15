package Flyweight;

/**
 * Create the tree instances.
 * Created by leonardo on 15/11/17.
 */
public class TreeFactory {

    private static Tree tree;

    static Tree createTree() {

        if (tree == null) {
            tree = new Tree();
        }
        return tree;
    }
}
