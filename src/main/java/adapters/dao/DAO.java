package adapters.dao;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {

    int salvar(T type);
    Optional<T> obterId(int id);
    List<T> obterTodos();
    int update(T type);
}
