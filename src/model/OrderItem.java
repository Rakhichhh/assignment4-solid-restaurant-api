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

    public int getMenuItemId() {
        return menuItemId;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
