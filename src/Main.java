import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MenuItem pizza = new FoodItem(1, "Pizza", 2500, true, 450);
        MenuItem cola = new DrinkItem(2, "Cola", 700, true, 500);

        List<BaseEntity> entities = new ArrayList<>();
        entities.add(pizza);
        entities.add(cola);

        for (BaseEntity e : entities) {
            System.out.println(e.getType() + " -> " + e.toDisplayString());
        }

        Order order = new Order(1, "Order#1", "NEW");
        order.addItem(new OrderItem(1, pizza, 2));
        order.addItem(new OrderItem(2, cola, 1));

        System.out.println(order.toDisplayString());
    }
}