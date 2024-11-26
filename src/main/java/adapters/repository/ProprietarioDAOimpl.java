package adapters.repository;

import adapters.dao.ProprietarioDAO;
import domain.entity.Proprietario;
import domain.repository.ProprietarioRepository;

import java.util.List;
import java.util.Optional;

public class ProprietarioDAOimpl implements ProprietarioRepository {

    private final ProprietarioDAO dao;

    public ProprietarioDAOimpl(ProprietarioDAO dao) {
        this.dao = dao;

    }

    @Override
    public void salvar(Proprietario proprietario) {
        int id=dao.salvar(proprietario);
        proprietario.setId(id);

    }


    @Override
    public void update(Proprietario proprietario) {

    }

    @Override
    public Optional<Proprietario> obterId(int id) {
        return Optional.empty();
    }

    @Override
    public List<Proprietario> obterTodos() {
        return null;
    }

}
