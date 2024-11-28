package adapters.dao;

import domain.entity.Inquilino;
import domain.entity.Locacao;
import domain.entity.Proprietario;

import java.util.List;
import java.util.Optional;

public class LocacaoDAOimpl implements LocacaoDAO{
    @Override
    public int salvar(Locacao type) {
        return 0;
    }

    @Override
    public Optional<Locacao> obterId(int id) {
        return Optional.empty();
    }

    @Override
    public List<Locacao> obterTodos() {
        return null;
    }

    @Override
    public List<Locacao> obterLocacaoPorProprietario(Proprietario proprietario) {
        return null;
    }

    @Override
    public List<Locacao> obterLocacaoPorInquilino(Inquilino inquilino) {
        return null;
    }
}
