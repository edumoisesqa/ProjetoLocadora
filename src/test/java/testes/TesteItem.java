package testes;

import ModeloPersistencia.ItemDAO;
import entidades.Categoria;
import entidades.Filme;
import entidades.Item;
import org.junit.Test;

public class TesteItem {

    @Test
    public void TesteItemInserir(){
        Categoria categoria = new Categoria();
        categoria.setId(8);

        Item item = new Item(categoria);
        item.setDescricao("Este e o item 8");
        item.setPreco(43);
        item.setTitulo("nome da razao ") ;
        item.setNumeroDias(234);

        ItemDAO.inserir(item);

        }


    }

