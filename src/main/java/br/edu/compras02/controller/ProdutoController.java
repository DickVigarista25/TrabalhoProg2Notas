
package br.edu.compras02.controller;

import java.util.ArrayList;
import br.edu.compras02.model.Produto;
import javax.swing.JOptionPane;

public class ProdutoController {
    private ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        listaDeProdutos.add(produto);
    }

    public void editarProduto(int index, Produto produto) {
        if (index >= 0 && index < listaDeProdutos.size()) {
            listaDeProdutos.set(index, produto);
        }
    }

    public void excluirProduto(int index) {
        if (index >= 0 && index < listaDeProdutos.size()) {
            listaDeProdutos.remove(index);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado para exclusão", "Erro ao excluir produto", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public Produto getProduto(int index) {
        if (index >= 0 && index < listaDeProdutos.size()) {
            return listaDeProdutos.get(index);
        }
        return null;
    }
}
