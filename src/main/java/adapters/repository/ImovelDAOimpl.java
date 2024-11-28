package adapters.repository;

import adapters.dao.ImovelDAO;
import domain.entity.Imovel;
import domain.entity.Proprietario;
import domain.repository.ImovelRepository;

import java.util.List;
import java.util.Optional;

public class ImovelDAOimpl implements ImovelRepository {
    private final ImovelDAO dao;

    public ImovelDAOimpl(ImovelDAO dao) {
        this.dao = dao;
    }


    @Override
    public List<Imovel> obterImovelPorProprietario(Proprietario proprietario) {
        return null;
    }

    @Override
    public void salvar(Imovel imovel) {
        int id=dao.salvar(imovel);
        imovel.setId(id);

    }

    @Override
    public Optional<Imovel> obterId(int id) {
        return dao.obterId(id);
    }

    @Override
    public List<Imovel> obterTodos() {
        return dao.obterTodos();
    }
}
