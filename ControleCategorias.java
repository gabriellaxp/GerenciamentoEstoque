/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.ArrayList;
import modelo.Categoria;

/**
 *
 * @author Aluno
 */
public class ControleCategorias {
    

    private static final ArrayList<Categoria> listaCategorias = new ArrayList<>();
    
    // adiciona um produto
    public void adicionar(Categoria categoria)
    {
        listaCategorias.add(categoria);
    }
    
    // pega o produto de uma determinada posicao
    public Categoria getCategoria(int linha)
    {
        return listaCategorias.get(linha);
    }
    
    // excluir um produto a partir de uma posicao
    public void remover(int linha)
    {
        listaCategorias.remove(linha);
    }
    
    // alterar um produto de uma determinada posicao
    public void alterar(int linha, Categoria categoria)
    {
        listaCategorias.set(linha, categoria);
    }
    
    // retorna todos os produtos
    public ArrayList<Categoria> getTodos()
    {
        return listaCategorias;
    }
    
}
    

