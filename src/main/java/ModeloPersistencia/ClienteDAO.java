package ModeloPersistencia;

import entidades.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    public static boolean inserir(Cliente cliente) {
        try {
            Connection conexao = Conexao.getConexao();
            String sql = "Insert INTO cliente (nome, email, telefone)"
                    + "VALUES (?,?,?)";
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, cliente.getNome());
            comando.setString(2, cliente.getEmail());
            comando.setString(3, cliente.getTelefone());
            comando.execute();
            comando.close();
            return true;
        } catch (Exception e) {
            return false;

        }


    }

    public static boolean alterar(Cliente cliente) {
        try {
            Connection conexao = Conexao.getConexao();
            String sql = "UPDATE cliente SET  "
                    + "nome = ?, "
                    + "email = ?, "
                    + "telefone = ? "
                    + "WHERE id = ?";
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, cliente.getNome());
            comando.setString(2, cliente.getEmail());
            comando.setString(3, cliente.getTelefone());
            comando.setString(4,String.valueOf(cliente.getId()));
            comando.executeUpdate();
            comando.close();
            return true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }


    }
}
