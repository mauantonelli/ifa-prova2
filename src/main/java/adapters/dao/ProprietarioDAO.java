package adapters.dao;

import domain.entity.Proprietario;

public interface ProprietarioDAO extends DAO<Proprietario> {
    void update(Proprietario proprietario);
}
