package adapters.dao;

import adapters.ConnectionFactory;
import domain.entity.Imovel;
import domain.entity.Proprietario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ImovelDAOimpl implements ImovelDAO{
    @Override
    public int salvar(Imovel imovel) {
        String sql = "INSERT INTO imovel (id, endereco, area total) values (?,?,?)";
        int generatedId = 0;
        try (PreparedStatement stmt = ConnectionFactory.createStatement(sql)) {
            stmt.setInt(1, imovel.getId());
            stmt.setString(2, imovel.getEndereco());
            stmt.setString(3, imovel.getAreaTotal());
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
    public Optional<Imovel> obterId(int id) {
        return Optional.empty();
    }

    @Override
    public List<Imovel> obterTodos() {
        return null;
    }

    @Override
    public List<Imovel> obterImovelPorProprietario(Proprietario proprietario) {
        return null;
    }
}
