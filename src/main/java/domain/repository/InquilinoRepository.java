package domain.repository;

import domain.entity.Inquilino;

public interface InquilinoRepository extends Repository<Inquilino>{

    void apagar(Inquilino inquilino);
}
