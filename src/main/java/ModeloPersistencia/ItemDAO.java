package ModeloPersistencia;

import entidades.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ItemDAO {
    public static boolean inserir(Item item){
        try{
            Connection conexao = Conexao.getConexao();
            String sql = "INSERT INTO  Item (titulo,preco, numeroDedias, categoria )"
                    + "VALUES (?,?,?,?)";
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1,item.getTitulo());
            comando.setString(2,item.getTitulo());
            comando.setString(3,String.valueOf(item.getNumeroDias()));
            comando.setString(4, String.valueOf(item.getCategoria()));
            comando.execute();
            comando.close();
            return true;


        }catch (Exception e){
            return false;
        }
    }
}
