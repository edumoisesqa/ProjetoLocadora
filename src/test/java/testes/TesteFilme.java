package testes;

import ModeloPersistencia.FilmeDAO;
import entidades.Filme;
import entidades.Categoria;
import org.junit.Test;

public class TesteFilme{

    @Test
    public void FilmeIserirTeste(){
        Categoria categoria = new Categoria();
        categoria.setId(8);

        Filme filme = new Filme(categoria);
        filme.setTitulo("olhos vermelhos");
        filme.setDescricao(" filme novo");
        filme.setPreco(9);
        filme.setNumeroDias(6);
        filme.setDiretor("Vergara");
        filme.setDuracao(3);

        FilmeDAO.inserir(filme);
        }
}
