package ModeloPersistencia;

import entidades.Jogo;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JogoDAO {
    public static  boolean inserir(Jogo jogo)
    {
        try{
            Connection conexao = Conexao.getConexao();
            String sql = "Insert INTO Jogo (titulo, descricao,preco,numeroDias, "
                    + "categoria , memoria, tipo)" + "VALUES(?,?,?,?,?,?)";
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1,jogo.getTitulo());
            comando.setString(2, jogo.getDescricao());
            comando.setDouble(3, jogo.getPreco());
            comando.setInt(4,jogo.getNumeroDias());
            comando.setString(5,jogo.getCategoria().getNome());
            comando.setInt(6,jogo.getMemoria());
            comando.setString(7,jogo.getTipo());
           int resultado = comando.executeUpdate();
           comando.close();

           return resultado >0;



        } catch (Exception e) {
            System.out.println(e);
            return false;

        }
    }
}
