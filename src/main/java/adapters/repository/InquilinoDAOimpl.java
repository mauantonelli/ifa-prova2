package adapters.repository;

import adapters.dao.InquilinoDAO;
import domain.entity.Inquilino;
import domain.repository.InquilinoRepository;

import java.util.List;
import java.util.Optional;

public class InquilinoDAOimpl implements InquilinoRepository {
    private final InquilinoDAO dao;

    public InquilinoDAOimpl(InquilinoDAO dao) {
        this.dao = dao;
    }


    @Override
    public void apagar(Inquilino inquilino) {

    }

    @Override
    public void salvar(Inquilino inquilino) {
        int id=dao.salvar(inquilino);
        inquilino.setId(id);
    }

    @Override
    public Optional<Inquilino> obterId(int id) {
        return dao.obterId(id);
    }

    @Override
    public List<Inquilino> obterTodos() {
        return dao.obterTodos();
    }
}
