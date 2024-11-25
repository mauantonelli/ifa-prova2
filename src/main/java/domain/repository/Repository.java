package domain.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T>{

    int salvar(T type);
    Optional<T> obterId(int id);
    List<T> obterTodos();
}
