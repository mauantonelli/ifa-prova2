package adapters.dao;

import adapters.ConnectionFactory;
import domain.entity.Inquilino;
import domain.entity.Locacao;
import domain.entity.Proprietario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class LocacaoDAOimpl implements LocacaoDAO{
    @Override
    public int salvar(Locacao locacao) {
        String sql = "INSERT INTO locacao (id, dataInicio, dataFim, valorAluguel) values (?,?,?,?)";

        int generatedId = 0;
        try (PreparedStatement stmt = ConnectionFactory.createStatement(sql)) {
            stmt.setInt(1, locacao.getId());
            stmt.setString(2, locacao.getDataInicio());
            stmt.setString(3, locacao.getDataFim());
            stmt.setDouble(4, locacao.getValorAluguel());
            stmt.executeUpdate();

            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next())
                generatedId = generatedKeys.getInt(1);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return generatedId;
    }

    @Override
    public Optional<Locacao> obterId(int id) {
        return Optional.empty();
    }

    @Override
    public List<Locacao> obterTodos() {
        return null;
    }

    @Override
    public List<Locacao> obterLocacaoPorProprietario(Proprietario proprietario) {
        return null;
    }

    @Override
    public List<Locacao> obterLocacaoPorInquilino(Inquilino inquilino) {
        return null;
    }
}
