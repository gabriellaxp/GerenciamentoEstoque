package controle;

import java.util.ArrayList;
import modelo.Produto;

/**
 *
 * @author Aluno
 */
public class ControleProdutos {
    private static ArrayList<Produto> listaProdutos = new ArrayList<>();
    
    // adiciona um produto
    public void adicionar(Produto produto)
    {
        listaProdutos.add(produto);
    }
    
    // pega o produto de uma determinada posicao
    public Produto getProduto(int linha)
    {
        return listaProdutos.get(linha);
    }
    
    // excluir um produto a partir de uma posicao
    public void remover(int linha)
    {
        listaProdutos.remove(linha);
    }
    
    // alterar um produto de uma determinada posicao
    public void alterar(int linha, Produto produto)
    {
        listaProdutos.set(linha, produto);
    }
    
    // retorna todos os produtos
    public ArrayList<Produto> getTodos()
    {
        return listaProdutos;
    }
    
}
