package model;

import java.util.ArrayList;
import java.util.List;

public class Order extends BaseEntity implements Validatable {

    private String status;
    private final List<OrderItem> items = new ArrayList<>();

    public Order(int id, String name, String status) {
        super(id, name);
        this.status = status;
    }

    @Override
    public String getType() {
        return "Order";
    }

    @Override
    public String toDisplayString() {
        return shortInfo()
                + " | status=" + status
                + " | total=" + calculateTotal();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double sum = 0;
        for (OrderItem i : items) {
            sum += i.calculateLineTotal();
        }
        return sum;
    }

    @Override
    public void validate() {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Order name cannot be empty");

        if (items.isEmpty())
            throw new IllegalArgumentException("Order must contain at least one item");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}
