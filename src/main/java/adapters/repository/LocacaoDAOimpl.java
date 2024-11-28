package adapters.repository;

import adapters.dao.LocacaoDAO;
import domain.entity.Inquilino;
import domain.entity.Locacao;
import domain.entity.Proprietario;
import domain.repository.LocacaoRepository;

import java.util.List;
import java.util.Optional;

public class LocacaoDAOimpl implements LocacaoRepository {
    private final LocacaoDAO dao;

    public LocacaoDAOimpl(LocacaoDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Locacao> obterLocacaoPorProprietario(Proprietario proprietario) {
        return null;
    }

    @Override
    public List<Locacao> obterLocacaoPorInquilino(Inquilino inquilino) {
        return null;
    }

    @Override
    public void salvar(Locacao type) {


    }

    @Override
    public Optional<Locacao> obterId(int id) {
        return Optional.empty();
    }

    @Override
    public List<Locacao> obterTodos() {
        return dao.obterTodos();
    }
}
