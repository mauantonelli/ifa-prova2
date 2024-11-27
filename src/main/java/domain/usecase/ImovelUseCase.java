package domain.usecase;

import domain.entity.Imovel;
import domain.repository.ImovelRepository;

import java.util.List;
import java.util.Optional;

public class ImovelUseCase {
    private final ImovelRepository repository;

    public ImovelUseCase(ImovelRepository repository) {
        this.repository = repository;
    }


    public void save(Imovel imovel){
        repository.salvar(imovel);
    }

    public Optional<Imovel> obterId (int id){
        return repository.obterId(id);

    }

    public List<Imovel> obterTodos(){
        return repository.obterTodos();
}
}
