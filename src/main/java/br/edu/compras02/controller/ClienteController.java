package br.edu.compras02.controller;

import br.edu.compras02.model.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClienteController {
    private ArrayList<Cliente> listaDeClientes =  new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        listaDeClientes.add(cliente);
    }
    
    public void atualizaTabela(JTable tabela){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        
        for (Cliente c: listaDeClientes){
            Object [] linha = {
                c.getNome(),
                c.getSexo(),
                c.getCpf(),
                c.getTelefone(),
                c.getDataDeNascimento(),
                c.getListaDeProdutos()
            };
            modelo.addRow(linha);
         }
    }

    public void editarCliente(int index, Cliente cliente) {
        if (index >= 0 && index < listaDeClientes.size()) {
            listaDeClientes.set(index, cliente);
        }
    }

    public void excluirCliente(int index) {
        if (index >= 0 && index < listaDeClientes.size()) {
            listaDeClientes.remove(index);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado para exclusão", "Erro ao excluir produto", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public Cliente getCliente(int index) {
        if (index >= 0 && index < listaDeClientes.size()) {
            return listaDeClientes.get(index);
        }
        return null;
    }
}
