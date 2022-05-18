package ModeloPersistencia;

import entidades.Categoria;
import entidades.Filme;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {
    public static boolean inserir(Filme filme){
        try{

            String sql = "INSERT INTO filme ( titulo, descricao, preco, "
                 +"numeroDias,diretor, duracao, categoria"   + "VALUES (?,?,?,?,?,?)";
            Connection  conexao = Conexao.getConexao();
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, filme.getTitulo());
            comando.setString(2,filme.getDescricao());
            comando.setDouble(3,filme.getPreco());
            comando.setInt(4,filme.getNumeroDias());
            comando.setString(5,filme.getDiretor());
            comando.setString(6, String.valueOf(filme.getDuracao()));
            comando.setInt(7,(filme.getCategoria().getId()));

            comando.executeUpdate();
            comando.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }





}
