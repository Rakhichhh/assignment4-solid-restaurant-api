package repository;

import model.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class InMemoryMenuItemRepository implements CrudRepository<MenuItem> {

    private final List<MenuItem> data = new ArrayList<>();
    private int nextId = 1;

    @Override
    public MenuItem create(MenuItem entity) {
        entity.setId(nextId++);
        data.add(entity);
        return entity;
    }

    @Override
    public MenuItem update(MenuItem entity) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == entity.getId()) {
                data.set(i, entity);
                return entity;
            }
        }
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return data.removeIf(x -> x.getId() == id);
    }

    @Override
    public MenuItem findById(int id) {
        for (MenuItem x : data) {
            if (x.getId() == id) return x;
        }
        return null;
    }

    @Override
    public List<MenuItem> findAll() {
        return new ArrayList<>(data);
    }
}
