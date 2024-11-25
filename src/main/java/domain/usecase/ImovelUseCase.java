package domain.usecase;

import domain.repository.ImovelRepository;

public class ImovelUseCase {
    private final ImovelRepository repository;

    public ImovelUseCase(ImovelRepository repository) {
        this.repository = repository;
    }


}
