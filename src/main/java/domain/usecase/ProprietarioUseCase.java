package domain.usecase;

import domain.entity.Proprietario;
import domain.repository.ProprietarioRepository;

import java.util.List;
import java.util.Optional;

public class ProprietarioUseCase {
    private final ProprietarioRepository repository;

    public ProprietarioUseCase(ProprietarioRepository repository) {
        this.repository = repository;
    }

    public void salvar(Proprietario proprietario){
        repository.salvar(proprietario);
    }

    public List<Proprietario> obterTodos(){
        return repository.obterTodos();
    }

    Optional<Proprietario> obterId(int id){
        return repository.obterId(id);
    }
}
