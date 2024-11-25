package domain.repository;

import domain.entity.Imovel;
import domain.entity.Proprietario;

import java.util.List;

public interface ImovelRepository extends Repository<Imovel>{

    List<Imovel> obterImovelPorProprietario(Proprietario proprietario);


}
