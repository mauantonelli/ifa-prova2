package domain.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T>{

    int save(T type);
    Optional<T> findById(int id);
    List<T> findAll();
}
