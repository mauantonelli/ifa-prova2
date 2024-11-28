package adapters.dao;

import adapters.ConnectionFactory;
import domain.entity.Inquilino;
import domain.entity.Proprietario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class InquilinoDAOimpl implements InquilinoDAO {
    @Override
    public int salvar(Inquilino inquilino) {
        String sql = "INSET INTO inqulino (id, nome, cpf) values (?,?,?)";
        int generatedId = 0;
        try (PreparedStatement stmt = ConnectionFactory.createStatement(sql)) {
            stmt.setInt(1, inquilino.getId());
            stmt.setString(2, inquilino.getNome());
            stmt.setString(3, inquilino.getCpf());
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
    public Optional<Inquilino> obterId(int id) {
        String sql = "SELECT * FROM inquilino WHERE id=?";
        try (PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Inquilino inquilino = new Inquilino(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("cpf")
                );

                return Optional.of(inquilino);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public List<Inquilino> obterTodos() {
        return null;
    }

    @Override
    public void apagar(Inquilino inquilino) {

    }
}
