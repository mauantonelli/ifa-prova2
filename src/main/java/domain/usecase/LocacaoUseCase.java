package domain.usecase;

import domain.repository.LocacaoRepository;

public class LocacaoUseCase {
    private final LocacaoRepository repository;

    public LocacaoUseCase(LocacaoRepository repository) {
        this.repository = repository;
    }
}
