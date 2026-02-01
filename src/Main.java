import controller.MenuItemController;
import model.DrinkItem;
import model.FoodItem;
import model.MenuItem;
import repository.InMemoryMenuItemRepository;
import service.MenuItemService;
import service.impl.MenuItemServiceImpl;
import utils.ReflectionUtils;

public class Main {
    public static void main(String[] args) {

        var repo = new InMemoryMenuItemRepository();
        MenuItemService service = new MenuItemServiceImpl(repo);
        MenuItemController controller = new MenuItemController(service);

        MenuItem burger = new FoodItem(0, "Burger", 5.99, true, 250);
        MenuItem cola = new DrinkItem(0, "Cola", 1.50, true, 500);

        controller.create(burger);
        controller.create(cola);

        controller.printAll();
        controller.printSorted();

        ReflectionUtils.printClassInfo(FoodItem.class);

       //for screenshots
        System.out.println("\n=== EXCEPTION DEMO ===");

        try {
            controller.create(new FoodItem(0, "   ", 2.0, true, 100)); // плохое имя
        } catch (Exception e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " -> " + e.getMessage());
        }

        try {
            controller.create(new DrinkItem(0, "Water", -1.0, true, 500)); // плохая цена
        } catch (Exception e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " -> " + e.getMessage());
        }
        try {
            service.delete(999); // или controller.delete(999), если добавишь в controller
        } catch (Exception e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " -> " + e.getMessage());
        }

    }
}

