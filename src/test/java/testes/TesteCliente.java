package testes;

import ModeloPersistencia.CategoriaDAO;
import ModeloPersistencia.ClienteDAO;
import entidades.Cliente;
import org.junit.Test;


public class TesteCliente {

    @Test
    public void AlterarTest() {

        Cliente cliente = new Cliente();
        cliente.setNome(" Diego eduaro alterado");
        cliente.setEmail("sam@hotmail.com");
        cliente.setTelefone("55964366922");
        cliente.setId(3);
        ClienteDAO.alterar(cliente);


    }
    @Test
    public void InserirCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Joel mano");
        cliente.setEmail("mano@hotmail.com");
        cliente.setTelefone("55964366922");

        ClienteDAO.inserir(cliente);
    }
}
