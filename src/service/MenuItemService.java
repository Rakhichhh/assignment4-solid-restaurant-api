package service;

import model.MenuItem;
import java.util.List;

public interface MenuItemService {
    MenuItem create(MenuItem item);
    List<MenuItem> getAll();
    List<MenuItem> getAllSortedByPrice();

    void delete(int id);
}
