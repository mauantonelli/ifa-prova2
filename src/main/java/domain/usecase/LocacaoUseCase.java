package domain.usecase;

import domain.entity.Inquilino;
import domain.entity.Locacao;
import domain.entity.Proprietario;
import domain.repository.LocacaoRepository;

import java.util.List;
import java.util.Optional;

public class LocacaoUseCase {
    private final LocacaoRepository repository;

    public LocacaoUseCase(LocacaoRepository repository) {
        this.repository = repository;
    }

    public void salvar(Locacao locacao){
        repository.salvar(locacao);
    }

    public List<Locacao> obterTodos(){
        return repository.obterTodos();
    }

    Optional<Locacao> obterPorId(int id){
        return repository.obterId(id);
    }

    List<Locacao> obterLocacaoPorProprietario(Proprietario proprietario){
        return repository.obterLocacaoPorProprietario(proprietario);
    }

    List<Locacao> obterLocacaoPorInquilino(Inquilino inqulino){
        return repository.obterLocacaoPorInquilino(inqulino);
    }
}
