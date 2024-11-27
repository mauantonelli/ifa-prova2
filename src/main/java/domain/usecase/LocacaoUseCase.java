package domain.usecase;

import domain.entity.Locacao;
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
}
