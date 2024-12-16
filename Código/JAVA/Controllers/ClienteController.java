package Controllers;

import Models.ClienteModel;
import java.util.List;

public class ClienteController implements InterfaceController<ClienteModel> {

    private List<ClienteModel> clientes;

    public ClienteController(List<ClienteModel> clientes) {
        this.clientes = clientes;
    }

    @Override
    public void cadastrar(ClienteModel cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso");
    }

    @Override
    public ClienteModel buscar(int cpf) {
        for (ClienteModel  cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado!");
        
        return null;
    }

    @Override
    public void editar(int cpf, ClienteModel novoCliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf() == cpf) {
            clientes.set(i, novoCliente);
            System.out.println("Clienteeditado com sucesso!");
            return;
        }
    }
    System.out.println("Cliente não encontrado!");
    }

    @Override
    public void remover(int cpf) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf() == cpf) {
                clientes.remove(i);
                System.out.println("Cliente removido com sucesso!");
                return;
            }
        }
        System.out.println("Cliente não encontrado!");
    }

    @Override
    public List<ClienteModel> listarTodos() {
        return clientes;
    }

    public void exibirNomesECpf() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        System.out.println("\n=== Lista de Filmes (Nome e ID) ===");
        for (ClienteModel cliente : clientes) {
            System.out.println("ID: " + cliente.getCpf() + " | Nome: " + cliente.getNome());
        }
    }
    
}