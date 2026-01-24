package model;

public abstract class BaseEntity {
    protected int id;
    protected String name;

    protected BaseEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // два абстрактных метода
    public abstract String getType();
    public abstract String toDisplayString();

    //1 конкретный метод
    public String shortInfo() {
        return id + " | " + name;
    }

    //инкапсуляция
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}