package domain.usecase;

import domain.repository.ProprietarioRepository;

public class ProprietarioUseCase {
    private final ProprietarioRepository repository;

    public ProprietarioUseCase(ProprietarioRepository repository) {
        this.repository = repository;
    }
}
