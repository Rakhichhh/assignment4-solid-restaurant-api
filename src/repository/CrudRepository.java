package repository;

import java.util.List;

public interface        CrudRepository<T> {
    T create(T entity);
    T update(T entity);
    boolean deleteById(int id);
    T findById(int id);
    List<T> findAll();
}
