package domain.repository;

import domain.entity.Inquilino;
import domain.entity.Locacao;
import domain.entity.Proprietario;

import java.util.List;

public interface LocacaoRepository extends Repository<Locacao>{

    List<Locacao> obterLocacaoPorProprietario(Proprietario proprietario);
    List<Locacao> obterLocacaoPorInquilino(Inquilino inquilino);
}
