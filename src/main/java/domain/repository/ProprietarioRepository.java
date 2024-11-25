package domain.repository;

import domain.entity.Proprietario;

public interface ProprietarioRepository extends Repository<Proprietario> {

    void update(Proprietario proprietario);
}
