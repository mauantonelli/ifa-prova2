package adapters.dao;

import domain.entity.Imovel;
import domain.entity.Proprietario;

import java.util.List;
import java.util.Optional;

public class ImovelDAOimpl implements ImovelDAO{
    @Override
    public int salvar(Imovel type) {
        return 0;
    }

    @Override
    public Optional<Imovel> obterId(int id) {
        return Optional.empty();
    }

    @Override
    public List<Imovel> obterTodos() {
        return null;
    }

    @Override
    public List<Imovel> obterImovelPorProprietario(Proprietario proprietario) {
        return null;
    }
}
