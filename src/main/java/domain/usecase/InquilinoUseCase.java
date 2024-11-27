package domain.usecase;

import domain.entity.Inquilino;
import domain.repository.InquilinoRepository;

import java.util.List;
import java.util.Optional;

public class InquilinoUseCase {
    private InquilinoRepository repository;

    public InquilinoUseCase(InquilinoRepository repository) {
        this.repository = repository;
    }

    public void salvar(Inquilino inquilino){
        repository.salvar(inquilino);
    }

        public List<Inquilino> obterTodos(){
        return repository.obterTodos();

    }

    Optional<Inquilino> obterId(int id){
        return repository.obterId(id);
    }
}
