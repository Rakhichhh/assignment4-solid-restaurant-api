package model;

public class OrderItem implements PricedItem {
    private final int menuItemId;
    private final MenuItem menuItem;
    private int quantity;

    public OrderItem(int menuItemId, MenuItem menuItem, int quantity) {
        this.menuItemId = menuItemId;
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public double calculateLineTotal() {
        return menuItem.getPrice() * quantity;
    }

    @Override
    public double getPrice() {
        return calculateLineTotal();
    }
}