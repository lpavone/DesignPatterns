package Composite;

import org.junit.Test;

/**
 * Created by leonardo on 04/06/17.
 */
public class MenuTestDrive {

    @Test
    public void test(){
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        dinnerMenu.add(new MenuItem(
                "Pasta",
                "Spaguetti with Sauce",
                true,
                3.89));
        dinnerMenu.add(new MenuItem(
                "Soup of the day",
                "Bowl of soup of the day with a slice of bread",
                false,
                3.29));
        dinnerMenu.add(new MenuItem(
                "Veggies and Rice",
                "Steamed vegetables over brown rice",
                true,
                3.99));
        dinnerMenu.add(new MenuItem(
                "Hotdog",
                "A hot dog with onions and cheese",
                false,
                4.20));

        pancakeHouseMenu.add(new MenuItem(
                "K&B Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "Regular Pancake Breakfast",
                "Pancake with sausages and fried eggs",
                false,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59));

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust",
                true,
                1.59));
        dessertMenu.add(new MenuItem(
                "Cheesecake",
                "Creamy cheesecake with chocolate",
                true,
                1.99));
        dessertMenu.add(new MenuItem(
                "Sorbet",
                "A scoop of raspberry and a scoop of lime",
                true,
                1.89));

        cafeMenu.add(new MenuItem(
                "Veggie Burguer and Fries",
                "Veggie burguer on a whole wheat bum, lettuce and tomato",
                true,
                3.99));
        cafeMenu.add(new MenuItem(
                "Soup of the day",
                "Soup and salad",
                false,
                3.69));
        cafeMenu.add(new MenuItem(
                "Burrito",
                "Large burrito with beans, salsa and guacamole",
                true,
                4.29));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
