package adapters.dao;

import domain.entity.Proprietario;

import java.util.List;
import java.util.Optional;

public class ProprietarioDAOimpl implements  ProprietarioDAO {
    @Override
    public int salvar(Proprietario type) {
        return 0;
    }

    @Override
    public Optional<Proprietario> obterId(int id) {
        return Optional.empty();
    }

    @Override
    public List<Proprietario> obterTodos() {
        return null;
    }

    @Override
    public void update(Proprietario proprietario) {

    }
}
