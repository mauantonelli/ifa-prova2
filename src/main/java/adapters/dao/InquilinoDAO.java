package adapters.dao;

import domain.entity.Inquilino;

public interface InquilinoDAO extends DAO<Inquilino>{
    void apagar(Inquilino inquilino);
}
