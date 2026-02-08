package model;

public abstract class BaseEntity {

    protected int id;
    protected String name;

    protected BaseEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

   
    public abstract String getType();
    public abstract String toDisplayString();


    public String shortInfo() {
        return id + " | " + name;
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return toDisplayString();
    }
}
