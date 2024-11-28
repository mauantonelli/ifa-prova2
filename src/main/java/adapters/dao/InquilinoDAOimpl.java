package adapters.dao;

import domain.entity.Inquilino;

import java.util.List;
import java.util.Optional;

public class InquilinoDAOimpl implements InquilinoDAO {
    @Override
    public int salvar(Inquilino type) {
        return 0;
    }

    @Override
    public Optional<Inquilino> obterId(int id) {
        return Optional.empty();
    }

    @Override
    public List<Inquilino> obterTodos() {
        return null;
    }

    @Override
    public void apagar(Inquilino inquilino) {

    }
}
