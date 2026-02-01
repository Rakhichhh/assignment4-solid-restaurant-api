package repository.jdbc;

import model.MenuItem;
import repository.CrudRepository;

import java.util.List;

public class MenuItemRepositoryJdbc implements CrudRepository<MenuItem> {

    @Override
    public MenuItem create(MenuItem entity) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public MenuItem update(MenuItem entity) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean deleteById(int id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public MenuItem findById(int id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public List<MenuItem> findAll() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
