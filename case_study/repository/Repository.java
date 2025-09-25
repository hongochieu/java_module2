package case_study.repository;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();
    void add(T t);
    void update(T t);
    void delete(String id);
}
