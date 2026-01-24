package model;

public abstract class MenuItem extends BaseEntity implements Validatable, PricedItem {
    protected double price;
    protected boolean available;

    protected MenuItem(int id, String name, double price, boolean available) {
        super(id, name);
        this.price = price;
        this.available = available;
    }

    public abstract String getCategory();

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void validate() {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Menu item name cannot be empty");
        if (price <= 0)
            throw new IllegalArgumentException("Price must be > 0");
    }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}