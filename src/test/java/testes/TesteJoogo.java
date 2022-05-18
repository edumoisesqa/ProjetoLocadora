package testes;

import ModeloPersistencia.JogoDAO;
import entidades.Categoria;
import entidades.Jogo;
import org.junit.Test;

public class TesteJoogo {

@Test
    public void JogoInserirTeste(){
        Categoria categoria = new Categoria();
        categoria.setTipo('F');
        categoria.setNome("Comedia");

        Jogo jogo = new Jogo(categoria);
        jogo.setDescricao("jogo legal");
        jogo.setMemoria(32);
        jogo.setCategoria(categoria);
        jogo.setDescricao("jogo epico");
        jogo.setTipo("hard");
        jogo.setPreco(989);
        jogo.setTitulo("Novo Joh7go");

        JogoDAO.inserir(jogo);


    }


}
