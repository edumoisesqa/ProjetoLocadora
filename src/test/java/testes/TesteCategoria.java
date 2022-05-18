package testes;

import ModeloPersistencia.CategoriaDAO;
import entidades.Categoria;
import org.junit.Test;

public class TesteCategoria {

    @Test
    public void CategoriaInserirTeste() {
        Categoria categoria = new Categoria();
        categoria.setNome("terror");
        categoria.setTipo('J');// F para filme J para jogo

        CategoriaDAO.inserir(categoria);
    }

    @Test
    public void AlterarCategoriaTeste() {
        Categoria categoria = new Categoria();
        categoria.setNome("terror");
        categoria.setTipo('F');// F para filme J para jogo
        categoria.setId(9);
        CategoriaDAO.alterar(categoria);
    }
}