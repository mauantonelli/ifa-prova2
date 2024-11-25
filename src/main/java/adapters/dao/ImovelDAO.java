package adapters.dao;

import domain.entity.Imovel;
import domain.entity.Proprietario;

import java.util.List;

public interface ImovelDAO extends DAO<Imovel> {
    List<Imovel> obterImovelPorProprietario(Proprietario proprietario);
}
