package model;

public class DrinkItem extends MenuItem {

    private int volumeMl;

    public DrinkItem(int id, String name, double price, boolean available, int volumeMl) {
        super(id, name, price, available);
        this.volumeMl = volumeMl;
    }

    @Override
    public String getType() {
        return "DrinkItem";
    }

    @Override
    public String getCategory() {
        return "DRINK";
    }

    @Override
    public String toDisplayString() {
        return shortInfo()
                + " | DRINK | price=" + price
                + " | volume=" + volumeMl + "ml"
                + " | available=" + available;
    }

    
    public int getVolumeMl() {
        return volumeMl;
    }

    public void setVolumeMl(int volumeMl) {
        this.volumeMl = volumeMl;
    }
}
