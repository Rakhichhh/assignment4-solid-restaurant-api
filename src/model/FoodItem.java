package model;

public class FoodItem extends MenuItem {
    private int grams;

    public FoodItem(int id, String name, double price, boolean available, int grams) {
        super(id, name, price, available);
        this.grams = grams;
    }

    @Override
    public String getType() { return "FoodItem"; }

    @Override
    public String getCategory() { return "FOOD"; }

    @Override
    public String toDisplayString() {
        return shortInfo() + " | FOOD | price=" + price + " | grams=" + grams + " | available=" + available;
    }
}