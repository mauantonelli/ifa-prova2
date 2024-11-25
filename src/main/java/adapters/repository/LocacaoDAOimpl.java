package adapters.repository;

import adapters.dao.LocacaoDAO;

public class LocacaoDAOimpl {
    private final LocacaoDAO dao;

    public LocacaoDAOimpl(LocacaoDAO dao) {
        this.dao = dao;
    }
}
