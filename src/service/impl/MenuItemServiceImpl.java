package service.impl;

import exception.InvalidInputException;
import exception.ResourceNotFoundException;
import model.MenuItem;
import repository.CrudRepository;
import service.MenuItemService;
import utils.SortingUtils;

import java.util.Comparator;
import java.util.List;

public class MenuItemServiceImpl implements MenuItemService {

    private final CrudRepository<MenuItem> repo;

    public MenuItemServiceImpl(CrudRepository<MenuItem> repo) {
        this.repo = repo;
    }

    @Override
    public MenuItem create(MenuItem item) {
        if (item == null)
            throw new InvalidInputException("MenuItem is null");

        if (item.getName() == null || item.getName().trim().isEmpty())
            throw new InvalidInputException("Name is empty");

        if (item.getPrice() <= 0)
            throw new InvalidInputException("Price must be > 0");

        return repo.create(item);
    }

    @Override
    public List<MenuItem> getAll() {
        return repo.findAll();
    }

    @Override
    public List<MenuItem> getAllSortedByPrice() {
        List<MenuItem> items = repo.findAll();
        return SortingUtils.sort(
                items,
                Comparator.comparingDouble(MenuItem::getPrice)
        );
    }


    @Override
    public void delete(int id) {
        boolean ok = repo.deleteById(id);
        if (!ok)
            throw new ResourceNotFoundException("MenuItem not found: " + id);
    }
}
