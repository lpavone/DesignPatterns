package Flyweight;

/**
 * Tree is state-free object, X, Y and age are not stored in the object.
 * Created by leonardo on 15/11/17.
 */
public class Tree {

    /**
     * Use this params to display the tree
     * @param x
     * @param y
     * @param age
     */
    public void display(int x, int y, int age){
        System.out.println(String.format("Draw a tree at (%s,%s) with diameter %s. (ObjectId: %s)",
            x, y, age, System.identityHashCode(this)));
    }
}
